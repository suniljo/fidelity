package com.fidelity.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fidelity.data.entities.Account;

@Repository //optional
public interface AccountRepository extends CrudRepository<Account, Long> {

}
