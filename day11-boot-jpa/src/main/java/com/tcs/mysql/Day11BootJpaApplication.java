package com.tcs.mysql;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day11BootJpaApplication implements CommandLineRunner{
	
	@Autowired
	ProductRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(Day11BootJpaApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.setDescription("A digital telivision");
		p1.setPrice(70000);
		
		repo.save(p1);
		
		Product p2 = new Product();
		p2.setDescription("A Smart mobile");
		p2.setPrice(50000);
		
		repo.save(p2);
		
		Product p3 = new Product();
		p3.setDescription("A wifi router");
		p3.setPrice(60000);
		
		repo.save(p3);
		
		
	}

}
