package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "book")
public class Book {
	
	@Id
	@Column(name = "id")
	private String bookid;
	
	@Column(name = "titulo")
	private String booktitle;
	
	@Column(name = "autor")
	private String bookauthor;
	
	@Column(name = "genero")
	private String bookgender;
	
	@Column(name = "isbn")
	private String bookisbn;
	
	@Column(name = "cantidad")
	private String bookquantity;

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getBooktitle() {
		return booktitle;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public String getBookgender() {
		return bookgender;
	}

	public void setBookgender(String bookgender) {
		this.bookgender = bookgender;
	}

	public String getBookisbn() {
		return bookisbn;
	}

	public void setBookisbn(String bookisbn) {
		this.bookisbn = bookisbn;
	}

	public String getBookquantity() {
		return bookquantity;
	}

	public void setBookquantity(String bookquantity) {
		this.bookquantity = bookquantity;
	}

	
}
