package com.tcs.collections;

public class Investor {
	
	int id;
	String name;
	String address;
	String instrument;
	double amount;
	
	public Investor() {
		// TODO Auto-generated constructor stub
	}

	public Investor(int id, String name, String address, String instrument, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.instrument = instrument;
		this.amount = amount;
	}

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

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Investor [id=" + id + ", name=" + name + ", address=" + address + ", instrument=" + instrument
				+ ", amount=" + amount + "]";
	}
	
	
	/*
	 public int compareTo(Investor o){
	 
	 		if(this.id<o.getId())
	 			return -1;
	 		else i f(this.id>o.getId())
	 			return 1;
	 		else
	 			return o;
	 }
	 		
	 */
	
	
	

}