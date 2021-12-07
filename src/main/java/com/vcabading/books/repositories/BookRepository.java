package com.vcabading.books.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vcabading.books.models.Book;

////////////////////////////////////////////////////////////////////
//	BOOK REPOSITORY
////////////////////////////////////////////////////////////////////

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	
	// **** Retrieve all the books *********************************
	List<Book> findAll();

	// **** Retrieve books with descriptions containing the search string
    List<Book> findByDescriptionContaining(String search);
    
    // **** Counts how many titles contain a certain string ********
    Long countByTitleContaining(String search);
    
    // **** Delete a book that starts with a specific title ********
    Long deleteByTitleStartingWith(String search);
}
