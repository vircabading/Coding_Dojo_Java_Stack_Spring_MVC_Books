package com.vcabading.books.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.vcabading.books.service.BookService;

/////////////////////////////////////////////////////////////
// BOOKS API
/////////////////////////////////////////////////////////////

@RestController
public class BooksApi {
	
	//	//// FIELDS /////////////////////////////////////////
	
	private final BookService bookService;

	//	//// CONSTRUCTORS ///////////////////////////////////
	
	public BooksApi(BookService bookService) {
		this.bookService = bookService;
	}
	
	
	
}
