package com.tcs.rest.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.rest.repository.ProductRepository;
import com.tcs.rest.resource.Product;
 
@Service
public class ProductService {

	@Autowired
	ProductRepository repo;
	
	public List<Product> getProducts(){
		List<Product> list = repo.findAll();
		return list;
	}
	
	public Product getProductById(int id) {
		
		Optional<Product> prod = repo.findById(id);
		return prod.get();
	}
	
	public Product save(Product p) {
		return repo.save(p);
	}
	
	public Product update(Product p) {
		Optional<Product> optional = repo.findById(p.getPid());
		Product tempProduct = optional.get();
		tempProduct.setDescription(p.getDescription());
		tempProduct.setPrice(p.getPrice());
		
		repo.save(tempProduct);
		return tempProduct;
	
	
	}
	
	public boolean delete(int id) {
		repo.deleteById(id);
		return true;
	}
	
}
