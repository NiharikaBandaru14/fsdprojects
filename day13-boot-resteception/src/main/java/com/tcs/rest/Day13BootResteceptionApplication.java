package com.tcs.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Day13BootResteceptionApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Day13BootResteceptionApplication.class, args);
		
		
		ConfigurableApplicationContext context = SpringApplication.run(Day13BootResteceptionApplication.class, args);
		String beans[] = context.getBeanDefinitionNames();
		
		for(String bean:beans) {
			System.out.println(bean);
		}
	
	}

}
