package com.tcs.oops.inheritance;

public class CardTransactions {
	
	public static void main(String[] args) {
		
		HDFCVisaDebitCard hdfc = new HDFCVisaDebitCard(12345,"03/25",919,"John",4346,500000);
		System.out.println(hdfc);
		
		ICICIMasterCreditCard icici = new ICICIMasterCreditCard(23456,"02/27",243,"Joe",7865,200000);
		
		hdfc.swipe(100000);
		icici.swipe(2300);
		
		//Object obj = new String("OLa");
		//String str = new Object(); // cannot do this bcoz obkect is widening type
		//is-a relationship
		
		Object obj= new Card(); //implicitly it extends from object bcoz object is superclass for all
		Card card = new HDFCVisaDebitCard(1234,"08/22",456,"lily",3456,100000);
		card.swipe(2000); //it calls the swipe method which is in hdfc
		
		card = new ICICIMasterCreditCard(23456,"02/27",243,"Joe",7865,200000);
		card.swipe(1000);
	}

}
