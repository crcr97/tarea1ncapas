package com.uca.capas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.dao.ClienteDAO;
import com.uca.capas.domain.Cliente;
import com.uca.capas.service.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	public ClienteService clienteService;
	
	@RequestMapping("/saveindex")
	public ModelAndView saveIndex(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("cliente", new Cliente());
		mav.setViewName("cliente/editcliente");
		return mav;
	}
	
	@RequestMapping("/vertodos")
	public ModelAndView verTodos() {
		ModelAndView mav = new ModelAndView();
		List<Cliente> clientes = clienteService.findAll();
		String Encabezado = "Hay " +Integer.toString(clientes.size())+" libros en existencia, "+" de "+Integer.toString(clienteService.autoresDistintos())+ " cantidad de autores diferentes";
		mav.addObject("Encabezado", Encabezado);
		mav.addObject("clientes", clientes);
		mav.setViewName("cliente/clientes");
		
		return mav;
	}
	
}
