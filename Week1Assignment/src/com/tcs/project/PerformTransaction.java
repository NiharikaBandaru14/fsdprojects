package com.tcs.project;

public class PerformTransaction {
	
public static void main(String[] args) {
		
		Investor i1 = new Investor(1,"abc","chennai","shares",50000);
		Investor i2 = new Investor(2,"pqr","hyd","bonds",75000);
		Investor i3 = new Investor(3,"xyz","bangalore","deposits",80000);
		Investor i4 = new Investor(4,"lmn","delhi","bonds",40000);
		Investor i5 = new Investor(5,"ijk","pune","shares",30000);
		
	 
		
		
		Transaction t1 = new Transaction(101,"01-jan-24",1000,1);
		Transaction t2 = new Transaction(102,"02-jan-24",3000,2);
		Transaction t3 = new Transaction(103,"03-jan-24",2000,3);
		Transaction t4 = new Transaction(104,"04-jan-24",4000,4);
		Transaction t5 = new Transaction(105,"05-jan-24",5000,5);
		
		TranscationCache tc = new TranscationCache();
		tc.addTransaction(t1);
		tc.addTransaction(t2);
		tc.addTransaction(t3);
		tc.addTransaction(t4);
		tc.addTransaction(t5);
		
		tc.showTransaction();
		
		System.out.println("Show the transaction of particular Investor");
		System.out.println(tc.showGivenTransaction(105));
}
}