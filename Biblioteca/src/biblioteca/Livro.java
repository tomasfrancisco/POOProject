package biblioteca;

import java.util.*;

public class Livro extends Item {

	private String isbn;
	private ArrayList <Autor> autores;
	private String cota;

	public String getIsbn() {
		return this.isbn;
	}

	/**
	 * 
	 * @param isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return this.autor;
	}

	/**
	 * 
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCota() {
		return this.cota;
	}

	/**
	 * 
	 * @param cota
	 */
	public void setCota(String cota) {
		this.cota = cota;
	}

	public Livro() {
		throw new UnsupportedOperationException();
	}

}