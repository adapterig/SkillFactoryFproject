package ru.skillfactory.ivan.fproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skillfactory.ivan.fproject.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
