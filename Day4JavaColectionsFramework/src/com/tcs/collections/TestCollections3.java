package com.tcs.collections;

import java.util.*;
import java.util.Map.Entry;

public class TestCollections3 {
	
	public static void main(String[] args) {
		
		Investor i1 = new Investor(1,"abc","chennai","shares",50000);
		Investor i2 = new Investor(2,"pqr","hyd","bonds",75000);
		Investor i3 = new Investor(3,"xyz","bangalore","deposits",80000);
		Investor i4 = new Investor(4,"lmn","delhi","bonds",40000);
		Investor i5 = new Investor(5,"ijk","pune","shares",30000);
		
		
		HashMap<Integer,Investor> dataMap = new HashMap<>();
		dataMap.put(i5.getId(), i5);
		dataMap.put(i3.getId(), i3);
		dataMap.put(i2.getId(), i2);
		
		System.out.println(dataMap);
		
		System.out.println(dataMap.get(2));
		
		System.out.println(dataMap.get(5));
		i5.setInstrument("bonds");					//updating happens
		dataMap.put(i5.getId(), i5);
		System.out.println(dataMap.get(5));
		
		
		//Map views
		//the key view, the value view and the key value view
		Set<Integer> keys = dataMap.keySet();
		System.out.println(keys);
		
		Collection<Investor> values = dataMap.values();
		System.out.println();
		
		Set<Entry<Integer,Investor>> keyvalues = dataMap.entrySet();
		System.out.println(keyvalues);
		
		Iterator<Entry<Integer, Investor>> iter = keyvalues.iterator();
		while(iter.hasNext()) {
			Entry<Integer, Investor> entry = iter.next();
			System.out.println(entry.getKey()+"="+entry.getValue());
			
		}
		
		
	}
}
