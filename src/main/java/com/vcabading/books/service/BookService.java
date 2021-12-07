package com.vcabading.books.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.vcabading.books.models.Book;
import com.vcabading.books.repositories.BookRepository;

////////////////////////////////////////////////////////////////
// BOOK SERVICE
////////////////////////////////////////////////////////////////

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	//	//// CONSTRUCTORS //////////////////////////////////////
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	//	//// CREATE ////////////////////////////////////////////
	
	// 	**** Create a Book *************************************
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}

	//	//// RETRIEVE //////////////////////////////////////////
	
	// 	**** Get All Books *************************************
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}

	// 	**** Get a Book by ID **********************************
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}

	//	//// UPDATE ////////////////////////////////////////////
	
	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			Book book = this.findBook(id);
			book.setTitle(title);
			book.setDescription(desc);
			book.setLanguage(lang);
			book.setNumberOfPages(numOfPages);
			return this.bookRepository.save(book);
		} else {
			return null;
		}

	}
	
	//	//// DELETE ////////////////////////////////////////////
	
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
		
	}
	
}
