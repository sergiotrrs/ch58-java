package org.generation;

import java.util.HashSet;

public class HashSetConceptos {

	public static void main(String[] args) {
		/*
		 * Una colección de tipo set es una colección NO ordenada. - No se permiten
		 * elementos duplicados - Cualquier elemento duplicado no se insertará
		 * 
		 * Sintaxis: HashSet<Object> varName = new HashSet<>();
		 * 
		 * - Crear una blacklist de palabras prohibidas en tu red social - Numeros de la
		 * suerte del 1 al 54, sin repetir. - Las categorías de un producto: [Juguetes,
		 * Deportes]
		 */

		// Crear una colección de tipo HashSet para almacenar
		// nombre s de libros
		HashSet<String> library = new HashSet<>();

		// Agregar 4 elementos a la colección, add()
		library.add("Harry Potter");
		library.add("El Señor de los anillo");
		library.add("Quiubule con el SAT");
		library.add("Triptofanito");
		library.add("El Lobo Estepario");

		System.out.println(library);

		// Agregar Elementos duplicados
		library.add("Cañitas");
		library.add("Cañitas");
		System.out.println(library);

		// Obtener el taño de la colección, size()
		System.out.println("Libros: " + library.size()); // 6

		// Conocer si un elemento existe, contains()
		System.out.println("Existe Cañitas: " + library.contains("Cañitas")); // true
		System.out.println("Existe Los Egipcios: " + library.contains("Los Egipcios")); // false

		// Remover un elemento, remove(E element)
		System.out.println("Eliminando Cañitas: " + library.remove("Cañitas")); // true

		// Iterando la colección
		for (String book : library) {
			System.out.println("Libro: " + book);
		}

		/*
		 * Crear una lista de 7 canciones. Usando una colección de tipo hashset, agregar
		 * 9 canciones Pero 2 de esas caciones están repetidas, No se deben agregar
		 * repetidas.
		 * 
		 * Recomendación: antes de agregar las canciones convierte el string a
		 * minúsculas
		 * 
		 * Imprimir la lista de las 7 canciones.
		 */
		// Crear una lista de 7 canciones usando una colección de tipo hashset
		HashSet<String> playList = new HashSet<>();
		playList.add("Schism".toLowerCase());
		playList.add("Poison".toLowerCase());
		playList.add("Jane".toLowerCase());
		playList.add("Against the wall".toLowerCase());
		playList.add("Welcome to the Black Parade".toLowerCase());
		playList.add("I just wanna live".toLowerCase());
		playList.add("Untitled".toLowerCase());

		// Agregar 9 canciones

		playList.add("Untitled".toLowerCase());
		playList.add("Untitled".toLowerCase());

		// Pero 2 de esas caciones están repetidas, No se deben agregar repetidas.
		// Recomendación: antes de agregar las canciones convierte el string a
		// minúsculas
		// Imprimir la lista de las 7 canciones.

		System.out.println(playList);

	}

}
