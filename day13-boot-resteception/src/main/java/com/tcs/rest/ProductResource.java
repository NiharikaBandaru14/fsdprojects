package com.tcs.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.rest.exceptions.InvalidValueException;

@RestController
public class ProductResource {
	
	@GetMapping
	public String message(String str) throws InvalidValueException, Exception{
		if(str == null)
			throw new NullPointerException("Value not provided.");  //runtime exception ,, by default exception is a  checked exception
		
		boolean isNumeric = str.chars().allMatch(x->Character.isDigit(x));
		if(isNumeric)
			throw new InvalidValueException("Expected string found int");  //user defined - checked exception
		
		if(str.length()==1)
			throw new Exception("value must be provided with length>1");
		return "Hello "+str;
	}

}
