package com.tcs.oops.encap.constructors;

public class CreateInvestors {
	
	public static void main(String[] args) {
		/*Investor i1= new Investor();
		System.out.println(i1); //default values id=0,name=null,address=null,amount=0.0*/
		
		Investor i1= new Investor(101, "John", "Chennai", 20000);
		System.out.println(i1);
		System.out.println(i1.getAmount());
		
		Investor i2= new Investor(101, "John", "Chennai");
		i2.setAmount(10000);
		System.out.println(i2); //it will add the amount 
		
		boolean res= i1==i2; //false -> hashcodes are different
		System.out.println(res);  
		
		boolean res1 = i1.equals(i2);
		System.out.println(res1); //true 
	}
}
