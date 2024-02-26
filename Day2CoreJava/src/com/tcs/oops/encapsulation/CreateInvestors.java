package com.tcs.oops.encapsulation;

public class CreateInvestors {
	
	public static void main(String[] args) {
		
		Investor i1=new Investor();
		i1.setId(101);
		i1.setName("john doe");
		i1.setAddress("Thoraipakkam");
		i1.setAmount(20000);
		
		System.out.println(i1.getName());
		System.out.println(i1.getAddress());
		System.out.println(i1.getId());
		
		System.out.println(i1); // it calls tostring method of the investor class
		
		Investor i2=new Investor();
		i2.setId(101);
		i2.setName("john doe");
		i2.setAddress("Thoraipakkam");
		i2.setAmount(20000);
		
		System.out.println(i2);
		
		boolean res = i1==i2;
		System.out.println(res); // return false bcoz these 2 obj have different hashcode(address)
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		Investor i3 = i1; //creating a duplicate obj from existing obj 
		res= i1==i3;
		System.out.println(res); //true
		
		i3=null; //forcefully not to refer to that (dereference)
		res= i1==i3;
		System.out.println(res); //false
	}

}
