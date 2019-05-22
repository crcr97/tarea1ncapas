package com.uca.capas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.uca.capas.domain.Book;
import com.uca.capas.service.BookService;


@Controller
public class BookController {
	
	@Autowired
	public BookService bookService;
	
	@RequestMapping("/showAll")
	public ModelAndView verTodos() {
		ModelAndView mav = new ModelAndView();
		List<Book> books = bookService.findAll();
		String tittle = "Hay " +Integer.toString(books.size())+" libros en existencia, "+" de "+Integer.toString(bookService.distinctAuthors())+ " cantidad de autores diferentes";
		mav.addObject("Tittle",tittle);
		mav.addObject("books", books);
		mav.setViewName("book/books");
		
		return mav;
	}
	
}
