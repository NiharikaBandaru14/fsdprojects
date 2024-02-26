package com.tcs.project;

import java.util.ArrayList;
import java.util.Iterator;



public class TranscationCache {
	
	ArrayList<Transaction> transactions = new ArrayList();

	public boolean addTransaction(Transaction t) {

		boolean flag = transactions.add(t);
		return flag;
	}
	
	public void showTransaction() {

		Iterator<Transaction> iter = transactions.iterator();
		while (iter.hasNext()) {
			Transaction t = iter.next();
			System.out.println(t);

		}

	}
	
	
	public Transaction showGivenTransaction(int tranId) {
		Transaction temp = null;
		for(Transaction i:transactions) {
			if(i.getTid() == tranId)
				temp = i;
		}
		return temp;
		
	}
	

}
