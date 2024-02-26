package com.tcs.oops.inheritance3.interfaces;

public class CardTransactions {
	
	public static void main(String[] args) {
		//CardIface iface = new CardIface();
		
		CardIface iface = null;
		iface = new HDFCVisaDebitCard(12345,"03/25",919,"John",4346,500000);
		iface.swipe(10000);

		iface = new ICICIMasterCreditCard(23456,"02/27",243,"Joe",7865,200000);
		iface.swipe(35000);
		
		HDFCVisaDebitCard hdfc = (HDFCVisaDebitCard)iface;
	}
		
		//Card card = new Card(); //it is not allowed
		/*Card card=null;
		card= new HDFCVisaDebitCard(12345,"03/25",919,"John",4346,500000);
		card.swipe(15000);
		
		card= new ICICIMasterCreditCard(23456,"02/27",243,"Joe",7865,200000);
		card.swipe(10000);
		
		
		
		
	}*?
		
		/*HDFCVisaDebitCard hdfc = new HDFCVisaDebitCard(12345,"03/25",919,"John",4346,500000);
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
	}*/

} 
