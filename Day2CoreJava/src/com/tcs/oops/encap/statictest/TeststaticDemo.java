package com.tcs.oops.encap.statictest;

public class TeststaticDemo {
	public static void main(String[] args) {
		System.out.println("from Test");
		
		StaticDemo sd;      //class not loaded
		StaticDemo.operation(); // class is loaded
		sd=new StaticDemo();
		sd=new StaticDemo();
		sd=new StaticDemo();
	}

}
