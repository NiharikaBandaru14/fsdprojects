package com.tcs.rest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.rest.resource.Product;
import com.tcs.rest.services.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/product/api.1.0")
//@Api(value="Product Service API 2.0",
//description="Rest endpoints for Product API")
public class productResource {      //rest controller
	
	// GET POST PUT DELETE - invoke the method
	
	@Autowired
	ProductService service;  //instance variable
	
	@GetMapping
	public String check() {
		
		return "/product/api.1.0";
	}
	
	@GetMapping
	@RequestMapping("/allproducts")
	//@ApiOperation(value="Returns the Product Entity")
	public List<Product> showAllProducts(){
		
		return service.getProducts();
	}
	
	@GetMapping
	@RequestMapping("/productid/{id}")
	//@ApiOperation(value="Returns the Product Entity")
	public Product fetchProduct(@PathVariable int id) {
		//return repo.findById(id);
		
		return service.getProductById(id);
	}
	
	@PostMapping
	@RequestMapping(consumes=MediaType.APPLICATION_JSON_VALUE,
					produces=MediaType.APPLICATION_JSON_VALUE,
					value="/addproduct")
	public Product createProduct(@RequestBody Product product) {
		 return service.save(product);
	}
	
	@PutMapping
	@RequestMapping(consumes=MediaType.APPLICATION_JSON_VALUE,
					produces=MediaType.APPLICATION_JSON_VALUE,
					value="/modifyproduct")
	public Product updateProduct(@RequestBody Product prod) {
		return service.update(prod);
	}
	
	@DeleteMapping
	@RequestMapping("/remove/{id}")
	public boolean deleteProduct(@PathVariable int id) {
		return service.delete(id);
	}
	
	
}
