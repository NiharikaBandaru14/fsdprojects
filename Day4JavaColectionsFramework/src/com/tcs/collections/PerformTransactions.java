package com.tcs.collections;

public class PerformTransactions {

	public static void main(String[] args) {
		
		Investor i1 = new Investor(1,"abc","chennai","shares",50000);
		Investor i2 = new Investor(2,"pqr","hyd","bonds",75000);
		Investor i3 = new Investor(3,"xyz","bangalore","deposits",80000);
		Investor i4 = new Investor(4,"lmn","delhi","bonds",40000);
		Investor i5 = new Investor(5,"ijk","pune","shares",30000);
		
	 
		
		
		Transcation t1 = new Transcation(101,"01-jan-24",1000,1);
		Transcation t2 = new Transcation(102,"02-jan-24",3000,2);
		Transcation t3 = new Transcation(103,"03-jan-24",2000,3);
		Transcation t4 = new Transcation(104,"04-jan-24",4000,4);
		Transcation t5 = new Transcation(105,"05-jan-24",5000,5);
		
		InvestmentTransactions it = new InvestmentTransactions();
		it.addTransaction(t1);
		it.addTransaction(t2);
		it.addTransaction(t3);
		it.addTransaction(t4);
		it.addTransaction(t5);
		
		it.showTransaction();
		
		System.out.println(it.showGivenTransaction(101));
		
		System.out.println(it.updateTransaction(102,20000.0));
		
	}
}
