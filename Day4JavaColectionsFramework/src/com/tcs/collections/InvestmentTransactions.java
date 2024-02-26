package com.tcs.collections;

import java.util.*;

public class InvestmentTransactions {
	
	ArrayList<Transcation> transactions = new ArrayList();
	
	public boolean addTransaction(Transcation t) {
		
		boolean flag= transactions.add(t);
		return flag;
	}
	
	public void showTransaction() {
		
		/*for(Transcation i:transactions) {
			System.out.println(transactions);
		}*/
		
		Iterator<Transcation> iter = transactions.iterator();
		while(iter.hasNext()) {
			Transcation t = iter.next();
			System.out.println(t);
			
		}
		
	}
	
	public Transcation showGivenTransaction(int tranId) {
		Transcation temp = null;
		for(Transcation i:transactions) {
			if(i.getTid() == tranId)
				temp = i;
		}
		return temp;
		
	}
	//update Transaction
	public Transcation updateTransaction(int tranId,double tranamount) {
		Transcation temp = null;
		for(Transcation i:transactions) {
		    if(i.getTid()==tranId)
		    	i.setTranAmount(tranamount);
		    	temp = i;
			
		}
		return temp;
	}

}