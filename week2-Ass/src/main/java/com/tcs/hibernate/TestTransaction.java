package com.tcs.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestTransaction {
	public static void main(String[] args) {

		Configuration configure = new Configuration();
		configure = configure.configure();
		SessionFactory factory = configure.buildSessionFactory();
		//System.out.println(factory);
		
		Session session = factory.openSession();
		//System.out.println(session);
		
		Transaction transaction = session.beginTransaction();
		
		Transaction1 t1 = new Transaction1(101,"01-jan-24",1000,1);
		Transaction1 t2 = new Transaction1(102,"02-jan-24",3000,2);
		Transaction1 t3 = new Transaction1(103,"03-jan-24",2000,3);
		Transaction1 t4 = new Transaction1(104,"04-jan-24",4000,4);
		Transaction1 t5 = new Transaction1(105,"05-jan-24",5000,5);
		
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);
		session.save(t5);
		
		
		
		
		transaction.commit();
		session.close();
	}

}
