package com.uca.capas.dao;

import java.math.BigInteger;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import com.uca.capas.domain.Book;

@Repository
public class BookDAOImpl implements BookDAO {
	
	@PersistenceContext(unitName = "capas")
	private EntityManager entityManager;

	@Override
	public List<Book> findAll() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.book");
		Query query = entityManager.createNativeQuery(sb.toString(), Book.class);
		List<Book> books = query.getResultList();
		return books;
	}

	@Override
	public List<Book> findBy(String filter, String searchVariable) throws DataAccessException {
				StringBuffer sb = new StringBuffer();
				sb.append("Select * from public.book where "+String.valueOf(filter)+" like "+"'"+String.valueOf(searchVariable)+"%'");	
				Query query = entityManager.createNativeQuery(sb.toString(),Book.class);
				List<Book> books = query.getResultList();
				return books;
	}
	
	@Override
	public int distinctAuthors()  throws DataAccessException{
		StringBuffer sb = new StringBuffer();
		sb.append("select count(distinct autor) from public.book");	
		Query query = entityManager.createNativeQuery(sb.toString());
		int distinctAuthors = ((Number) query.getSingleResult()).intValue();
		return distinctAuthors;
	}
	
	@Override
	public int totalBooks() throws DataAccessException{
		StringBuffer sb = new StringBuffer();
		sb.append("select sum(cantidad) from public.book");	
		Query query = entityManager.createNativeQuery(sb.toString());
		int totalBooks = ((Number) query.getSingleResult()).intValue();
		return totalBooks;
	}

}
