package org.generation;

import java.util.ArrayList;

public class ArrayListConceptos {

	public static void main(String[] args) {
		/*
		 * Una colección, parte del Java Collections Framework, es 
		 * un objeto que agrupa múltiples elementos en una sola unidad. 
		 * Su principal ventaja es que su tamaño es dinámico, puede 
		 * crecer o reducirse según sea necesario.
		 * 
		 * Existen varios tipos, los más comunes son: 
		 * List: Una secuencia ordenada de elementos. 
		 *       Permite duplicados. (Ej: ArrayList)
		 * Set: Un conjunto de elementos únicos. 
		 *       No permite duplicados. (Ej: HashSet)
		 * Map: Un conjunto de pares clave-valor. 
		 *       Las claves deben ser únicas. (Ej: HashMap)
		 * 
		 * Array List.
		 * https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
		 * 
		 * Una colección List 
		 * - Es una colección ordenada (respeta
		 * el orden en que se agregan) 
		 * - Se permite elementos duplicados 
		 * - Se basa en un array redimensionable que crece su tamaño, según crece la colección de
		 * elementos. 
		 * - Esta colección es la mejor rendimiento tiene.
		 * 
		 * Sintaxis: ArrayList<object> varName = new ArrayList<>();
		 * 
		 * 
		 */
		
		// Definir una colección de tipo ArrayList de frutas
		ArrayList<String> fruits = new ArrayList<>();
		
		// Agregar un elemento con el método add() 
		fruits.add("Jícama");

	}

}
