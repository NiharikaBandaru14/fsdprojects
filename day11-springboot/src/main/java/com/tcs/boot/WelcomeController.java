package com.tcs.boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping; 


@Controller 
//@RequestMapping("/go")
public class WelcomeController {
	
	@GetMapping
	public String invite(Model map) {
		//System.out.println("from getmapping..");
		
		map.addAttribute("location","Chennai-one");
		return "registrationform.html";
	}
}
