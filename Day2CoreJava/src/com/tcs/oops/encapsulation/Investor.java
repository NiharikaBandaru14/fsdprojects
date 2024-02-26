package com.tcs.oops.encapsulation;

public class Investor {
	
	int id;
	String name;     // data members or instance variables 
	String address;
	double amount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Investor [id=" + id + ", name=" + name + ", address=" + address + ", amount=" + amount + "]";
	}
	
	

}
