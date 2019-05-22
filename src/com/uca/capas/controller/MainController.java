package com.uca.capas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.uca.capas.dao.BookDAO;
import com.uca.capas.domain.Book;

@Controller
public class MainController {
	
	@Autowired
	private BookDAO bookDao;
	
	@RequestMapping("/")
	public String initMain() {
		return "main";
	}
	
	@RequestMapping("/searchBook")
	public ModelAndView buscarbook(@RequestParam String filter, @RequestParam String searchVariable) {
		ModelAndView mav = new ModelAndView();
		List<Book> books = bookDao.findBy(filter,searchVariable);
		String tittle = "Se encontraron resultados "+Integer.toString(books.size())+" para "+searchVariable+" en "+filter;
		if(books == null) {
			mav.addObject("resultado", 0);
			mav.setViewName("book");
		}
		else {
			mav.addObject("books", books);
			mav.addObject("Tittle", tittle);
			mav.setViewName("book/books");
		}

		return mav;
	}
	
	

}
