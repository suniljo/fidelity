package com.fidelity.data.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fidelity.data.controllers.AccountController;
import com.fidelity.data.entities.Account;
import com.fidelity.data.repository.AccountRepository;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional // Ensures atomicity for this method
    public void transferFunds(Long fromAccountId, Long toAccountId, BigDecimal amount) {
        log.info("Transfer Fund: {} - {} - {}", fromAccountId, toAccountId, amount);
    	// 1. Decrease balance in sender's account
         Account fromAccount = accountRepository.findById(fromAccountId)
        		 							    .orElseThrow(() -> new RuntimeException("Sender account not found"));
        
        if (fromAccount.getBalance().compareTo(amount) < 0) {
            throw new RuntimeException("Insufficient funds");
        }
        
        fromAccount.setBalance(fromAccount.getBalance().subtract(amount));
        accountRepository.save(fromAccount);


        // 2. Increase balance in recipient's account
        Account toAccount = accountRepository.findById(toAccountId)
        									.orElseThrow(() -> new RuntimeException("Recipient account not found"));
            
        toAccount.setBalance(toAccount.getBalance().add(amount));
        accountRepository.save(toAccount);
    }
}

