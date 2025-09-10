package com.main.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.Account;
import com.main.model.Status;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUsername(String username);
    List<Account> findAllByStatus(Status status);
}
