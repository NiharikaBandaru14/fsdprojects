package com.tcs.hibernate;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	
	public static void main(String[] args) {
		
		Configuration configure = new Configuration();
		configure = configure.configure();
		SessionFactory factory = configure.buildSessionFactory();
		//System.out.println(factory);
		
		Session session = factory.openSession();
		//System.out.println(session);
		
		Transaction transaction = session.beginTransaction();
		
		ArrayList<Transaction1> transactions = new ArrayList();
		ArrayList<Investor1> investors = new ArrayList();
		
		Transaction1 tn1=session.get(Transaction1.class, 1); 
		Transaction1 tn2=session.get(Transaction1.class, 2);
		Transaction1 tn3=session.get(Transaction1.class, 3);
		Transaction1 tn4=session.get(Transaction1.class, 4);
		Transaction1 tn5=session.get(Transaction1.class, 5);
		
		transactions.add(tn1);
		transactions.add(tn2);
		transactions.add(tn3);
		transactions.add(tn4);
		transactions.add(tn5);
		
		Investor1 inv1 =session.get(Investor1.class, 1);
		Investor1 inv2 =session.get(Investor1.class, 2); 
		Investor1 inv3 =session.get(Investor1.class, 3); 
		Investor1 inv4 =session.get(Investor1.class, 4); 
		Investor1 inv5 =session.get(Investor1.class, 5);
		investors.add(inv1);
		investors.add(inv2);
		investors.add(inv3);
		investors.add(inv4);
		investors.add(inv5);
		
		for(Investor1 i:investors) {
			double bal = 0.0;
			for(Transaction1 t:transactions) {
				if(i.getId()==t.getInvestorId()) {
					bal = i.getAmount()-t.getTranAmount();
				}
			}
			i.setAmount(bal);
			session.update(i);
			
		}

		transaction.commit();
		session.close();
	}

	    
		
	

}
