package ru.skillfactory.ivan.fproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.skillfactory.ivan.fproject.model.Account;
import ru.skillfactory.ivan.fproject.model.Response;
import ru.skillfactory.ivan.fproject.repository.AccountRepository;

import java.math.BigDecimal;
import java.util.Optional;

@RestController
@RequestMapping("api/")
public class AccountController {
    @Autowired
    AccountRepository accountRepository;

    @GetMapping("getBalance")
    public Response getBalance(@RequestParam Integer id) {
        Response response = new Response();
        if (accountRepository.findById(id).isPresent()) {
            response.setAnswer(accountRepository.findById(id).get().getBalance());
        } else {
            response.setAnswer(new BigDecimal(-1));
            response.setDescription("Account not found");
        }
        return response;
    }

    @PostMapping("takeMoney")
    public Response takeMoney(@RequestParam Integer id, @RequestParam BigDecimal money) {
        Response response = new Response();
        if (accountRepository.findById(id).isPresent() && money.compareTo(new BigDecimal(0)) >= 0) {
            Account account = accountRepository.findById(id).get();
            if (account.getBalance().subtract(money).compareTo(new BigDecimal(0)) >= 0) {
                account.setBalance(account.getBalance().subtract(money));
                accountRepository.save(account);
                response.setAnswer(1);
                response.setDescription(account.getBalance().toPlainString());
            } else {
                response.setAnswer(0);
                response.setDescription("Not enough money");
            }
        } else if (money.compareTo(new BigDecimal(0)) < 0) {
            response.setAnswer(0);
            response.setDescription("Wrong request");
        } else {
            response.setAnswer(0);
            response.setDescription("Account not found");
        }

        return response;
    }
    @PostMapping("putMoney")
    public Response putMoney(@RequestParam Integer id, @RequestParam BigDecimal money) {
        Response response = new Response();
        if (accountRepository.findById(id).isPresent() && money.compareTo(new BigDecimal(0)) >= 0) {
            Account account = accountRepository.findById(id).get();
                account.setBalance(account.getBalance().add(money));
                accountRepository.save(account);
                response.setAnswer(1);
                response.setDescription(account.getBalance().toPlainString());
        } else if (money.compareTo(new BigDecimal(0)) < 0) {
            response.setAnswer(0);
            response.setDescription("Wrong request");
        } else {
            response.setAnswer(0);
            response.setDescription("Account not found");
        }

        return response;
    }

}
