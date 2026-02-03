package com.fidelity.rest.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateRestController {
	
	@GetMapping(path= {"/today", "/date"})
	public ResponseEntity<String> showTodaysDateAndTime(){
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
		
		String responseText = formatter.format(dateTime);
		
		//ResponseEntity<String> responseEntity = new ResponseEntity<String>(HttpStatus.OK);
		//ResponseEntity<String> responseEntity = new ResponseEntity<String>(responseText, HttpStatus.CREATED);
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("company", "Fidelity Investments");
		responseHeaders.add("location", "Bangalore");
		
		ResponseEntity<String> responseEntity = new ResponseEntity<String>(responseText, responseHeaders, HttpStatus.CREATED);
		
		//return responseEntity;
		
		//return ResponseEntity.ok().build();
		//return ResponseEntity.ok(responseText);
		//return ResponseEntity.ok().body(responseText);
		//return ResponseEntity.badRequest().body(responseText);
		return ResponseEntity.ok()
							 .headers(responseHeaders)
							 .body(responseText);
	}
}
