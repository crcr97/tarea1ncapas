package com.uca.capas.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Book;

public interface BookDAO {
	
	public List<Book> findAll() throws DataAccessException;
			
	public List<Book> findBy(String filter, String searchVariable) throws DataAccessException;
	
	public int distinctAuthors()  throws DataAccessException;

}
