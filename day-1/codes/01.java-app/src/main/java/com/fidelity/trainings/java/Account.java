package com.fidelity.trainings.java;

import java.util.Random;

public class Account {
	long accno;
	String accName;
	float balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(String accName, float balance) {
		super();
		this.accno = generateAccountNumber();
		this.accName = accName;
		this.balance = balance;
	}

	private long generateAccountNumber() {
		long acno = new Random().nextLong(90000000, 100000000);
		return acno;
	}

	void deposit(float amt) {
		this.balance += amt;
		System.out.println("Rs." + amt + " Credited || Balance: " + this.balance);
	}

	void withdraw(float amt) {
		if (this.balance >= amt) {
			this.balance -= amt;
			System.out.println("Rs." + amt + " Debited || Balance: " + this.balance);
		} else {
			System.err.println("Insufficient Balance");
		}
	}

	void getBalance() {
		System.out.println(String.format("A/C NO: %-10d | NAME: %-20s | BALANCE: %.2f", this.accno, this.accName, this.balance));
	}
}
