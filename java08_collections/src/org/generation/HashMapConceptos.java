package org.generation;

import java.util.HashMap;

public class HashMapConceptos {

	public static void main(String[] args) {
		/*
		 * Una colección Map, es una relación clave(key): valor (value)
		 * que forma una tabla de datos.
		 * 
		 *  - Nos funciona mejor para encontrar elementos
		 *  
		 *  Sintaxis:
		 *  HashMap< key, value > varName = new HashMap<>();
		 */
		// Instanciar la clase HashMap
		HashMap<Integer , String > legos = new HashMap<>();
		
		// Agregar valores a la colección, put()
		legos.put(10360, "Shuttle Carrier Aircraft");
		// Agregar 3 elementos
		legos.put(21357, "Disney Pixar Luxo Jr");
		legos.put(11203, "La casa Familiar de Bluey");
		legos.put(75331, "The Razor Crest");
		legos.put(60430, "Nave Espacial Interestelar");
		legos.put(75375, "Halcón Milenario");
		legos.put(75000, "La casa Familiar de Bluey");
		System.out.println( legos );
		
		// Reemplazar un elemento
		legos.put(75375, "StarWars - Halcón Milenario");
		System.out.println( legos );
		
		// Obtener un elemento, get(key)
		System.out.println("Me gusta : " + legos.get(11203)); // La casa Familiar de Bluey
		
		// Remover un elemento, remove(key)
		System.out.println("Se elimina: " + legos.remove(75331) ); // "The Razor Crest"

		// Iterar la colección usando las keys
		for(int model : legos.keySet()) {
			System.out.println("Lego set: " + legos.get(model));
		}
		
		// Iterar la colección con sus valores
		for(String legoName : legos.values() ) {
			System.out.println("Nombre del lego: " + legoName);
		}
		
		/*
		 *  Aplicaciones del HashMap:
		 *  - Directorios telefónicos
		 *  - Contador de votos de una encuesta
		 *         key     - value
		 *         OpcionA - 1
		 *         OpcionB - 12
		 *         OpcionC - 1
		 *  - Lista de productos
		 *         key     - value
		 *         SKU     - Objeto del medicamento
		 *  - Calificaciones de estudiantes
		 *         key       - value
		 *     Calificacion  - Estudiantes
		 *         100       - { José, Ana, María }
		 *         90        - { Sergio, Manuel }
		 *         80        - { Tatiana, Diana }
		 *         70        - { Samuel }
		 */
		
		
	}

}
