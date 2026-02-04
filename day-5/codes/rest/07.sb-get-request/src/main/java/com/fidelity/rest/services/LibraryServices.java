package com.fidelity.rest.services;

import java.util.List;

import com.fidelity.rest.dto.Book;

public interface LibraryServices {
	
	public Book findBookById(Integer bid);	
	public List<Book> findAll();
}
