package com.vcabading.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.vcabading.books.models.Book;
import com.vcabading.books.service.BookService;

/////////////////////////////////////////////////////////////
//	BOOK CONTROLLER
/////////////////////////////////////////////////////////////

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	//	//// SHOW ///////////////////////////////////////////
	
	@GetMapping("/")
	public String index() {
		return "redirect:/books";
	}
	
	//	//// RETRIEVE ///////////////////////////////////////
	
	@GetMapping("/books/{id}")
	public String booksID(@PathVariable("id") Long id, Model model) {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		return "booksid.jsp";
	}
	
	@GetMapping("/books")
	public String books() {
		return "books.jsp";
	}
}
