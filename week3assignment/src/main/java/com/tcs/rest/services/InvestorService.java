package com.tcs.rest.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.rest.repository.InvestorRepository;
import com.tcs.rest.resource.Investor1;
 
@Service
public class InvestorService {

	@Autowired
	InvestorRepository repo;
	
	public List<Investor1> getInvestors(){
		List<Investor1> list = repo.findAll();
		return list;
	}
	
	public Investor1 getInvestorById(int id) {
		
		Optional<Investor1> prod = repo.findById(id);
		return prod.get();
	}
	
	public Investor1 save(Investor1 p) {
		return repo.save(p);
	}
	
	public Investor1 update(Investor1 p) {
		Optional<Investor1> optional = repo.findById(p.getId());
		Investor1 tempInvestor = optional.get();
		tempInvestor.setName(p.getName());
		tempInvestor.setAddress(p.getAddress());
		tempInvestor.setInstrument(p.getInstrument());
		tempInvestor.setAmount(p.getAmount());
		
		repo.save(tempInvestor);
		return tempInvestor;
	
	
	}
	
	public boolean delete(int id) {
		repo.deleteById(id);
		return true;
	}
	
}
