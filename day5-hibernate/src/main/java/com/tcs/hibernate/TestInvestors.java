package com.tcs.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestInvestors {
	
	public static void main(String[] args) {
		
		Configuration configure = new Configuration();
		configure = configure.configure();
		SessionFactory factory = configure.buildSessionFactory();
		//System.out.println(factory);
		
		Session session = factory.openSession();
		//System.out.println(session);
		
		Transaction transaction = session.beginTransaction();
		
	    //create
		Investor inv = new Investor();
		inv.setId(101);
		inv.setName("john");
		inv.setAddress("chennai");
		inv.setAmount(10000);
		
		session.save(inv);
		System.out.println(inv);
		
		
		
		transaction.commit();
		session.close();
		
		
		
	}

}
