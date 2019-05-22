package com.uca.capas.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Cliente;

public interface ClienteService {
	
	public List<Cliente> findAll();
		
	public List<Cliente> findBy(String filtro,String codigo);
		
	public int autoresDistintos();
}
