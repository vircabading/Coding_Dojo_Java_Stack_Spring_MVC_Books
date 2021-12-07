package com.vcabading.books.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/////////////////////////////////////////////////////////////
//	BOOK CONTROLLER
/////////////////////////////////////////////////////////////

@Controller
public class BookController {
	
	//	//// SHOW ///////////////////////////////////////////
	
	@GetMapping("/")
	public String index() {
		return "redirect:/books";
	}
	
	//	//// RETRIEVE ///////////////////////////////////////
	
	
}
