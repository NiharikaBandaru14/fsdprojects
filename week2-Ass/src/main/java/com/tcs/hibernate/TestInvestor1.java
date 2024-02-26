package com.tcs.hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestInvestor1 {
	public static void main(String[] args) {
		Configuration configure = new Configuration();
		configure = configure.configure();
		SessionFactory factory = configure.buildSessionFactory();
		// System.out.println(factory);

		Session session = factory.openSession();
		// System.out.println(session);

		Transaction transaction = session.beginTransaction();
		
		Investor1 i1 = new Investor1(1,"abc","chennai","shares",50000);
		Investor1 i2 = new Investor1(2,"pqr","hyd","bonds",75000);
		Investor1 i3 = new Investor1(3,"xyz","bangalore","deposits",80000);
		Investor1 i4 = new Investor1(4,"lmn","delhi","bonds",40000);
		Investor1 i5 = new Investor1(5,"ijk","pune","shares",30000);
		
		session.save(i1);
		session.save(i2);
		session.save(i3);
		session.save(i4);
		session.save(i5);
		
		
		
		
		transaction.commit();
		session.close();
	}

}
