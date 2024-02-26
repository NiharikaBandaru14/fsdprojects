package com.tcs.oops.encap.constructors;

import java.util.Objects;

public class Investor {
	int id;
	String name;
	String address;
	double amount;
	
	public Investor() {
		// TODO Auto-generated constructor stub
	}
	
	public Investor(int id, String name, String address, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.amount = amount;
	}
	
	public Investor(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		
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

	@Override
	public int hashCode() {
		return this.id*32+
			   this.name.length()*32*2+							//Objects.hash(address, id, name)
			   this.address.length()*32*2;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Investor other = (Investor) obj;
		return Objects.equals(address, other.address) && id == other.id && Objects.equals(name, other.name);
	}
	
	

	
	
	 

}
