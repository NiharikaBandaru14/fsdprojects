package com.tcs.patterns;

public class CarFactory {
	
	public static Car makeAcar(String brand) {
		
		if(brand.equals("Hyundai"))
			return new HyundaiCar();
		else if(brand.equals("Toyota"))
			return new ToyotaCar();
		else
			return null;
	}

}
