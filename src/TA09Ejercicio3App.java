


public class TA09Ejercicio3App {

	public static void main(String[] args) {

		Libro libro1 = new Libro("El amanecer", "Unamuno", 500, "47593010");
		Libro libro2 = new Libro("Crímenes", "Alfredo Gauss", 100, "97593010");
		
		System.out.println(libro1);
		System.out.println(libro2);
		
		System.out.println(masPaginas(libro1, libro2));
	}
	
	public static Libro masPaginas(Libro libro1, Libro libro2) {
		// Devuelve el libro con más páginas
		return (libro1.getNumero_de_paginas() > libro2.getNumero_de_paginas()) ? libro1 : libro2;
	}
	
}
