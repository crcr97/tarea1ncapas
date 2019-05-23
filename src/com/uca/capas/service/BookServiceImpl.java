package com.uca.capas.service;

import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import com.uca.capas.dao.BookDAO;
import com.uca.capas.domain.Book;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookDAO bookDao;
	
	public List<Book> findAll() {
		return bookDao.findAll();
	}

	@Override
	public List<Book> findBy(String filter, String searchVariable) {
			return bookDao.findBy(filter,searchVariable);	
	}
	
	@Override
	public int distinctAuthors() {
		return bookDao.distinctAuthors();
	}
	
	@Override
	public int totalBooks(){
		return bookDao.totalBooks();
	}

	
}
