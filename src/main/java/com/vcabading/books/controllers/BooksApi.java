package com.vcabading.books.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vcabading.books.models.Book;
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
	
	//	//// POST ///////////////////////////////////////////
	
	@RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }
	
	//	//// RETRIEVE ///////////////////////////////////////
	
	@RequestMapping("/api/books")
    public List<Book> index() {
        return bookService.allBooks();
    }
}
