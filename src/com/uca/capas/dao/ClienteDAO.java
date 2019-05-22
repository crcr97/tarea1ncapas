package com.uca.capas.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Cliente;

public interface ClienteDAO {
	
	public List<Cliente> findAll() throws DataAccessException;
			
	public List<Cliente> findBy(String filtro, String cadena) throws DataAccessException;
	
	public int autoresDistintos()  throws DataAccessException;

}
