package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.dao.ClienteDAO;
import com.uca.capas.domain.Cliente;

@Controller
public class MainController {
	
	@Autowired
	private ClienteDAO clienteDao;
	
	@RequestMapping("/")
	public String initMain() {
		return "main";
	}
	
	@RequestMapping("/buscarcliente")
	public ModelAndView buscarCliente(@RequestParam String listaFiltro, @RequestParam String codigo) {
		ModelAndView mav = new ModelAndView();
		System.out.println(listaFiltro+" "+codigo);
		List<Cliente> c = clienteDao.findBy(listaFiltro,codigo);
		String Encabezado = "Se encontraron resultados "+Integer.toString(c.size())+" para "+codigo+" en "+listaFiltro;
		if(c == null) {
			mav.addObject("resultado", 0);
			mav.setViewName("cliente");
		}
		else {
			mav.addObject("clientes", c);
			mav.addObject("Encabezado", Encabezado);
			mav.setViewName("cliente/clientes");
		}

		return mav;
	}
	
	

}
