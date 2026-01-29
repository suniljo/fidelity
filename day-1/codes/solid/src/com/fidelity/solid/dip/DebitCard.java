package com.fidelity.solid.dip;

public class DebitCard implements BankCard {
	 public void doTransaction(long amount) {
		 System.out.println("paying using Debit Card");
	 }
}
