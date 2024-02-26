package com.tcs.oops.inheritance;

public class HDFCVisaDebitCard extends Card {

	public HDFCVisaDebitCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HDFCVisaDebitCard(int cardNo, String expiry, int cvv, String name, int pin, double amount) {
		super(cardNo, expiry, cvv, name, pin, amount);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean swipe(double transactionAmount) {
		//first get the blnc from amount
		//based on card no of the customer
		System.out.println("transaction Successful from hdfc");
		return true;
	}
	
	
	

}
