package com.fidelity.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	//@RequestMapping("/welcome")
	//@RequestMapping(path= "/welcome", method= RequestMethod.GET)
	//@GetMapping("/welcome")
	@GetMapping(path = "/welcome")
	public String showWelcomeMessage() {
		return "Welcome to Fidelity";
	}
}
