package com.fidelity.rest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RequestHeaderAndBodyRestController {
	
	@PostMapping(path="/data")
	public ResponseEntity<String> procesRequestHeaderAndBody(@RequestHeader(value = "company", required=false, defaultValue = "NA") String companyName,
															 @RequestHeader Integer empno,
															 @RequestBody(required = false) String requestData){
		String responseText = String.format("Company Header = %s\n"+
											"Employee No= %d\n"+
											"Content = %s", companyName, empno, requestData);
		
		return ResponseEntity.ok().body(responseText);
		
	}
}
