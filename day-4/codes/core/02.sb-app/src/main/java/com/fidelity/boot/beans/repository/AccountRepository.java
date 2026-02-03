package com.fidelity.boot.beans.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {

	public AccountRepository() {
		System.out.println("AccountRepository :: Constructor");
	}

}
