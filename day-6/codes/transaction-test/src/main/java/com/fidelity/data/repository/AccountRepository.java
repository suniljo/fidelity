package com.fidelity.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fidelity.data.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
