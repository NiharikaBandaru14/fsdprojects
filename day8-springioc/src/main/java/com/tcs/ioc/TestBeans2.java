package com.tcs.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeans2 {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		context.registerShutdownHook();   //block the main thread
		Object obj = context.getBean("b");
		
		
		B b = (B)obj;
		b.other();
		
		C c = (C)context.getBean("c");
		c.other();
		
//		boolean res = context.isPrototype("a");
//		System.out.println(res);   //return false for singleton , true for prototype
		
//		res=context.isSingleton("a");
//		System.out.println(res);
	}

}
