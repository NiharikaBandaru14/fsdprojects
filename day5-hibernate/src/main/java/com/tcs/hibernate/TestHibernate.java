package com.tcs.hibernate;

import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;


public class TestHibernate {
	
	public static void main(String[] args) {
		
		Configuration configure = new Configuration();
		configure = configure.configure();
		
		SessionFactory factory = configure.buildSessionFactory();
		System.out.println(factory);
		
		Session session = factory.openSession();
		System.out.println(session);
		
		//fetching multiole rows from db
	    Query<Employee> query = session.createQuery("select e from Employee e");
	    List<Employee> list = query.list();
	    Iterator<Employee> iter = list.iterator();
	    while(iter.hasNext()) {
	    	System.out.println(iter.next());
	    }
	  	
		//C R U D
		//before dml begin a transaction
		
		Transaction transaction = session.beginTransaction();
		
		/*
		//fetch a row from db
		Employee emp = session.get(Employee.class, 1);
		System.out.println(emp); */
		
		
		/*
		//update a row in db
		Employee emp = session.get(Employee.class, 1);
		emp.setSal(50000);
		
		session.update(emp);
		System.out.println(emp);
		*/
		
		
		//delete a row in db
		Employee emp = session.get(Employee.class, 1);
		session.delete(emp);
		
		
		
		/*
		Employee emp = new Employee();
		emp.setEname("Siri");
		emp.setSal(15500);
		session.save(emp);
        */
		
		transaction.commit(); 
		
		session.close();
		
		
	}

}
