package com.tcs.exceptions;

public class TestFinally {
	public static void main(String[] args) {
		
		System.out.println("before exception try/catch/finally");
		try {
			System.out.println(10/2);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("from finally block.....");
		}
		
		System.out.println("after try/catch/finally blocks");
	}

}
