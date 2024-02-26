package com.tcs.oops.encap.statictest;

public class StaticDemo {
	
	{
		System.out.println("from non-static anonymous block "); //non-static -> doesn't print
	}
	
	static{
		System.out.println("from static anonymous block "); 
	}
	
	int data; //non static means instance variable or member
	static int item; //static variable or member ---> it is created when class is loading ,,,only one at life time
	
	//non-static method
	void method() {
		data=10;
		item = 20;
		
	}
	
	static void operation() {
		//data = 2; //we cannot access ->it is not a static one
		item=3;
	}

}
