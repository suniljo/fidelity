package com.fidelity.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fidelity.rest.dto.Book;
import com.fidelity.rest.services.LibraryServices;

@RestController
@RequestMapping(path="/api/library")
public class LibraryRestController {
	@Autowired
	private LibraryServices libraryServices;
	
	@GetMapping
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> books = libraryServices.findAll();
		return ResponseEntity.ok(books);
	}
	
	@GetMapping(path="/{bid}", produces= {"application/json", "application/xml"})
	public ResponseEntity<Book> searchBookById(@PathVariable Integer bid){
		Book book = libraryServices.findBookById(bid);
		if(book != null) {
			return ResponseEntity.ok().body(book);
		}else {
			return ResponseEntity.notFound().build();
		}			
	}
}
