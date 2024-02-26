package com.tcs.hibernate;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)   //it generates eno automatically like 1,2,3
	private int eno;
	private String ename;
	private double sal;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eno, String ename, double sal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	

}
