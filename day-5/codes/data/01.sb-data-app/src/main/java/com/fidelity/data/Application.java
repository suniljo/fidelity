package com.fidelity.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.fidelity.data.dtos.AccountStatus;
import com.fidelity.data.entities.Account;
import com.fidelity.data.repository.AccountRepository;

@SpringBootApplication
@EnableJpaAuditing
public class Application implements CommandLineRunner {
	@Autowired
	private AccountRepository accountRepo;
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("spring container initialized!!");		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("inside run() method");
		/*
		Account acc = new Account();
		acc.setId(1520000546L);
		acc.setHolderName("Sunil Joseph");
		acc.setBalance(10000f);
		
		Account savedAcc = accountRepo.save(acc);
		System.out.println(savedAcc);
		*/
		
		Account acc1 = new Account(1000121L, "Praveen", 25000f, AccountStatus.ACTIVE);
		Account acc2 = new Account(1000122L, "Sanjay", 35000f, AccountStatus.ACTIVE);
		Account acc3 = new Account(1000123L, "Valerie", 45000f, AccountStatus.CLOSED);
		Account acc4 = new Account(1000124L, "Chris", 5000f, AccountStatus.LOCKED);
		
		List<Account> accounts = Arrays.asList(acc1, acc2, acc3, acc4);
		accountRepo.saveAll(accounts);

	}

}
