package com.fidelity.rest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/cibil")
public class CibilRestController {
	@GetMapping(path={"/score/{name}/{pan}", "/score/{name}"})
	public ResponseEntity<String> getCibilScore(@PathVariable("name") String customerName,
												@PathVariable(name = "pan", required=false) String pan){
		if(pan != null && pan.length()==10) {
			//logic to get CIBIL Score from data source
			int cibilScore = 789;
			String responseText = String.format("Hello %s, your PAN is %s and Score is %d",  customerName, pan, cibilScore);
			return ResponseEntity.ok().body(responseText);
		}
		return ResponseEntity.badRequest().build();
	}
}
