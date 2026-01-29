package com.fidelity.solid.dip;

public class ShoppingMall {
	private BankCard card;
	
	public ShoppingMall(BankCard card) {
		this.card = card;
	}
	
	public void doPayment(long amount) {
		card.doTransaction(amount);
	}
	public static void main(String[] args) {
		//DebitCard dCard = new DebitCard();		
		CreditCard dCard = new CreditCard();
		
		ShoppingMall mall = new ShoppingMall(dCard);
		mall.doPayment(2500L);
	}

}
