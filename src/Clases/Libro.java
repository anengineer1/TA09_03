package Clases;

public class Libro {

	// constantes
	final private String TITULO_POR_DEFECTO = "";
	final private String AUTOR_POR_DEFECTO = "";
	final private int PAGINAS_POR_DEFECTO = 0;
	final private String ISBN_POR_DEFECTO = "0000000000";

	private String titulo;
	private String autor;
	private int numero_de_paginas;
	private String isbn;

	public Libro() {
		this.autor = this.AUTOR_POR_DEFECTO;
		this.titulo = this.TITULO_POR_DEFECTO;
		this.numero_de_paginas = this.PAGINAS_POR_DEFECTO;
		this.isbn = this.ISBN_POR_DEFECTO;
	}

	public Libro(String titulo, String autor, int numero_de_paginas, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.numero_de_paginas = numero_de_paginas;
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "El libro con ISBN " + this.isbn + " creado por el autor " + this.autor + " tiene " + this.numero_de_paginas + " páginas";
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumero_de_paginas() {
		return numero_de_paginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setNumero_de_paginas(int numero_de_paginas) {
		this.numero_de_paginas = numero_de_paginas;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
