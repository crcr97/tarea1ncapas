package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uca.capas.dao.ClienteDAO;
import com.uca.capas.domain.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	ClienteDAO clienteDao;
	
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return clienteDao.findAll();
	}

	@Override
	public List<Cliente> findBy(String filtro, String codigo) {
		// TODO Auto-generated method stub
			return clienteDao.findBy(filtro,codigo);	
	}
	
	public int autoresDistintos() {
		return clienteDao.autoresDistintos();
	}
	

}
