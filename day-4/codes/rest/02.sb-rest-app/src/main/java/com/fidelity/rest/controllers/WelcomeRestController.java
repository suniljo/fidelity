package com.fidelity.rest.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/fidelity/api")
public class WelcomeRestController {
	
	@GetMapping(path="/welcome")
	public String showWelcomeMessageGet() {
		return "Welcome to Fidelity - GET";
	}
	
	@PostMapping(path="/welcome")
	public String showWelcomeMessagePOST() {
		return "Welcome to Fidelity - POST";
	}
	
	@PutMapping(path="/welcome")
	public String showWelcomeMessagePut() {
		return "Welcome to Fidelity - PUT";
	}
	
	@DeleteMapping(path="/welcome")
	public String showWelcomeMessageDelete() {
		return "Welcome to Fidelity - DELETE";
	}	
	
	@PatchMapping(path="/welcome")
	public String showWelcomeMessagePatch() {
		return "Welcome to Fidelity - PATCH";
	}	
}
