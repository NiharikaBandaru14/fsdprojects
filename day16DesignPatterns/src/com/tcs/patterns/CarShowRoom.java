package com.tcs.patterns;

public class CarShowRoom {
	public static void main(String[] args) {
		
		Car car = CarFactory.makeAcar("Hyundai");
		System.out.println(car);
		
	     car = CarFactory.makeAcar("Toyota");
		System.out.println(car);
	}

}
