package com.cts.blood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserHomeController {

	

		@GetMapping("/user/homepage")
		public String UserHomePage() {
			return "Userhomepage";
		}
		
	
	  	
	    
	    
}
