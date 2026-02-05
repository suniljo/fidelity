package com.fidelity.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fidelity.rest.entities.Book;
import com.fidelity.rest.exceptions.BookNotFoundException;
import com.fidelity.rest.services.LibraryServices;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path="/api/library")
@Tag(name = "Library Books Controller", description = "New Book, Search, Delete Book")
public class LibraryRestController {
	@Autowired
	private LibraryServices libraryServices;
	
	@GetMapping
	public ResponseEntity<Iterable<Book>> getAllBooks(){
		Iterable<Book> books = libraryServices.findAll();
		return ResponseEntity.ok(books);
	}
	
	@GetMapping(path="/{bid}", produces= {"application/json", "application/xml"})
	public ResponseEntity<Book> searchBookById(@PathVariable Integer bid){
		Book book = libraryServices.findBookById(bid);
		if(book != null) {
			return ResponseEntity.ok().body(book);
		}
		//throw new RuntimeException("Book with Book ID:" + bid+" not available");
		throw new BookNotFoundException("Book with Book ID:" + bid+ " not available");
	}
	
	@PostMapping(consumes = {"application/json", "application/xml"})
	@Operation(summary = "New Book Enrtry",
    			description = "add a new book to library stock")
	public ResponseEntity<Book> saveNewBook(@Valid @RequestBody Book book){
		//System.out.println(book);
		Book savedBook = libraryServices.saveBook(book);
		if(savedBook != null)
			return new ResponseEntity<Book>(savedBook, HttpStatus.CREATED);
		
		return ResponseEntity.badRequest().build();
	}	
	
	@DeleteMapping
	public ResponseEntity<?> deleteBook(@RequestParam Integer isbn){
		boolean bookDelStatus = libraryServices.deleteBookById(isbn);
		if(bookDelStatus)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT); //204
		
		//return ResponseEntity.notFound().build();
		throw new BookNotFoundException("Book with Book ID:" + isbn+ " not available");
	}	
}
