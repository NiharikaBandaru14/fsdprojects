package com.tcs.oops.inheritance2;

public class ICICIMasterCreditCard extends Card {

	public ICICIMasterCreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ICICIMasterCreditCard(int cardNo, String expiry, int cvv, String name, int pin, double amount) {
		super(cardNo, expiry, cvv, name, pin, amount);
		// TODO Auto-generated constructor stub
	}
	public boolean swipe(double transactionAmount) {
		
		System.out.println("transaction Successful from icici");
		return true;
	}
	
	

}
