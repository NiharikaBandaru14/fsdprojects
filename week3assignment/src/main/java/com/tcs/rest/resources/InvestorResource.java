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

import com.tcs.rest.resource.Investor1;
import com.tcs.rest.services.InvestorService;

@RestController
@RequestMapping("/investor/api.1.0")
public class InvestorResource {      //rest controller
	
	// GET POST PUT DELETE - invoke the method
	
	@Autowired
	InvestorService service;  //instance variable
	
	@GetMapping
	public String check() {
		
		return "/investor/api.1.0";
	}
	
	@GetMapping
	@RequestMapping("/allinvestors")
	public List<Investor1> showAllProducts(){
		
		return service.getInvestors();
	}
	
	@GetMapping
	@RequestMapping("/investorid/{id}")
	public Investor1 fetchProduct(@PathVariable int id) {
		//return repo.findById(id);
		
		return service.getInvestorById(id);
	}
	
	@PostMapping
	@RequestMapping(consumes=MediaType.APPLICATION_JSON_VALUE,
					produces=MediaType.APPLICATION_JSON_VALUE,
					value="/addinvestor")
	
	public Investor1 createInvestor(@RequestBody Investor1 investor1) {
		 return service.save(investor1);
	}
	
	@PutMapping
	@RequestMapping(consumes=MediaType.APPLICATION_JSON_VALUE,
					produces=MediaType.APPLICATION_JSON_VALUE,
					value="/modifyinvestor")
	public Investor1 updateInvestor(@RequestBody Investor1 prod) {
		return service.update(prod);
	}
	
	@DeleteMapping
	@RequestMapping("/remove/{id}")
	public boolean deleteInvestor(@PathVariable int id) {
		return service.delete(id);
	}
	
	
}
