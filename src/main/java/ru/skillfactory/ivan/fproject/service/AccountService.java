package ru.skillfactory.ivan.fproject.service;


import org.springframework.stereotype.Service;
import ru.skillfactory.ivan.fproject.model.Account;
import ru.skillfactory.ivan.fproject.repository.AccountRepository;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class AccountService {

    private AccountRepository accountRepository;

    public BigDecimal getBalance(Integer id) {
        if (accountRepository.findById(id).isPresent()) {
            return accountRepository.findById(id).get().getBalance();
        } else {
            return new BigDecimal(-1);
        }
    }

    public int takeMoney(Integer id, BigDecimal money) {
        Optional<Account> account = accountRepository.findById(id);
        if (account.isPresent()) {
            if (account.orElseThrow().getBalance().subtract(money).compareTo(new BigDecimal(0)) >= 0) {
                account.orElseThrow().setBalance(account.orElseThrow().getBalance().subtract(money));
                accountRepository.save(account.orElseThrow());
                return 1;
            }
        }
        return 0;
    }

    public int putMoney(Integer id, BigDecimal money) {
        Optional<Account> account = accountRepository.findById(id);
        if (account.isPresent()) {
            account.orElseThrow().setBalance(account.orElseThrow().getBalance().add(money));
            accountRepository.save(account.orElseThrow());
            return 1;
        }
        return 0;
    }
}
