package com.tcs.oops.encap.statictest;

public class CreateInvestors {
	
	public static void main(String[] args) {
		/*Investor i1= new Investor();
		System.out.println(i1); //default values id=0,name=null,address=null,amount=0.0*/
		
		/*Investor i1= new Investor(101, "John", "Chennai", 20000);
		System.out.println(i1);
		System.out.println(i1.getAmount());
		
		Investor i2= new Investor(101, "John", "Chennai");
		i2.setAmount(10000);
		System.out.println(i2); //it will add the amount 
		
		boolean res= i1==i2; //false -> hashcodes are different
		System.out.println(res);  
		
		boolean res1 = i1.equals(i2);
		System.out.println(res1); //true */
		
		System.out.println(Investor.getCount());
		
		Investor i1= new Investor(101, "John", "Chennai", 20000);
		System.out.println(i1.getCount());
		Investor i2= new Investor(101, "Joe", "siruseri");
		System.out.println(i2.getCount());
		Investor i3= new Investor(101, "Johnson", "dlf", 25000);
		System.out.println(i3.getCount());
		Investor i4= new Investor(); //it goes to the default constuctor where we don't increment the count in it.
		System.out.println(i4.getCount()); //it will give the result of last count
		
		i1.setCount(240);
		System.out.println(i4.getCount()); // in i4 ->240
		
		i1.setAmount(44000);
		System.out.println(i4.getAmount()); // return 0.0 --> bcoz amount is not a static variable so it return default value
		
		
	}
}
