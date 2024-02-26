package com.tcs.collections;

import java.util.HashSet;

public class TestCollections {
	
	public static void main(String[] args) {
		
		Investor i1 = new Investor(1,"abc","chennai","shares",50000);
		Investor i2 = new Investor(2,"pqr","hyd","bonds",75000);
		Investor i3 = new Investor(3,"xyz","bangalore","deposits",80000);
		Investor i4 = new Investor(4,"lmn","delhi","bonds",40000);
		Investor i5 = new Investor(5,"ijk","pune","shares",30000);
		Investor i6 = new Investor(5,"ijk","pune","shares",30000);
		Investor i7=i6; //not allowed
		
		HashSet<Investor> set = new HashSet<>();
		set.add(i5);
		set.add(i4);
		set.add(i3);
		set.add(i2);
		set.add(i1);
		set.add(i6);
		set.add(i7);
		
		System.out.println(set.size());
		System.out.println(set);
		
	}

}
