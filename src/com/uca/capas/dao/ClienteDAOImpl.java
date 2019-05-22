package com.uca.capas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uca.capas.domain.Cliente;

@Repository
public class ClienteDAOImpl implements ClienteDAO {
	
	@PersistenceContext(unitName = "capas")
	private EntityManager entityManager;

	@Override
	public List<Cliente> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		//Defino la consulta
		sb.append("select * from public.book");
		//Creo un objeto Query a partir del entityManager para ejecutar la consulta
		Query query = entityManager.createNativeQuery(sb.toString(), Cliente.class);
		//Ejecuto la consulta y establezco el resultado a una coleccion de Clientes
		List<Cliente> res = query.getResultList();
		
		return res;
	}

	@Override
	public List<Cliente> findBy(String filtro, String cadena) throws DataAccessException {
				StringBuffer sb = new StringBuffer();
				sb.append("Select * from public.book where "+String.valueOf(filtro)+"="+"'"+String.valueOf(cadena)+"'");	
				Query query = entityManager.createNativeQuery(sb.toString(),Cliente.class);
				List<Cliente> c = query.getResultList();
				return c;
	}
	
	@Override
	public int autoresDistintos()  throws DataAccessException{
		StringBuffer sb = new StringBuffer();
		sb.append("select count(distinct autor) from public.book");	
		Query query = entityManager.createNativeQuery(sb.toString());
		int autoresDistintos = ((Number) query.getSingleResult()).intValue();
		return autoresDistintos;
	}



}
