package com.tcs.oops;

public class CreateInvestors {
	
	public static void main(String[] args) {
		
		Investor i1=new Investor(); // i1 is reference to an object which will be created in memory.
		//we thought i1 is an implicitly object but it is act like a handler or pointer.
		//at runtime which will be given a copy of all the datamembers of class
		
		i1.id = 101;
		i1.name = "John";
		i1.address = "Chennai";
		i1.amount = 20000;
		
		
		System.out.println(i1);
		//String str=i1.getClass().getName()+'@'+Integer.toHexString(i1.hashCode());
		//System.out.println(str);
		
	}

}
