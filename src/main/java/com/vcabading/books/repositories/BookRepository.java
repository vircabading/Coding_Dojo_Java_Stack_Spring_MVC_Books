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

}
