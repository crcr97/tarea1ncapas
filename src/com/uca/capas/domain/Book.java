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
	private String idLibro;
	
	@Column(name = "titulo")
	private String stitulo;
	
	@Column(name = "autor")
	private String sautor;
	
	@Column(name = "genero")
	private String sgenero;
	
	@Column(name = "isbn")
	private String bisbn;

	public String getidLibro() {
		return idLibro;
	}

	public void setidLibro(String idLibro) {
		this.idLibro = idLibro;
	}

	public String getStitulo() {
		return stitulo;
	}

	public void setStitulo(String stitulo) {
		this.stitulo = stitulo;
	}

	public String getSautor() {
		return sautor;
	}

	public void setSautor(String sautor) {
		this.sautor = sautor;
	}

	public String getSgenero() {
		return sgenero;
	}

	public void setSgenero(String sgenero) {
		this.sgenero = sgenero;
	}

	public String getBisbn() {
		return bisbn;
	}

	public void setBisbn(String bisbn) {
		this.bisbn = bisbn;
	}

}
