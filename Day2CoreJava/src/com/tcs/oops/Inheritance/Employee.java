package com.tcs.oops.Inheritance;

public class Employee {
	
	private int empid;
	private String name;
	private  String location;
	
	public Employee() {
		
	}
	
	public Employee(int empid, String name, String location) {
		super();
		this.empid = empid;
		this.name = name;
		this.location = location;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", location=" + location + "]";
	}
	
	

}
