package com.uca.capas.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Book;

public interface BookService {
	
	public List<Book> findAll();
		
	public List<Book> findBy(String filter,String searchVariable);
		
	public int distinctAuthors();
	
	public int totalBooks();
	
}
