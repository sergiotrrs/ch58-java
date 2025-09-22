package org.generation;

import java.util.ArrayList;

public class ArrayListConceptos {

	public static void main(String[] args) {
		/*
		 * Una colección, parte del Java Collections Framework, es un objeto que agrupa
		 * múltiples elementos en una sola unidad. Su principal ventaja es que su tamaño
		 * es dinámico, puede crecer o reducirse según sea necesario.
		 * 
		 * Existen varios tipos, los más comunes son: List: Una secuencia ordenada de
		 * elementos. Permite duplicados. (Ej: ArrayList) Set: Un conjunto de elementos
		 * únicos. No permite duplicados. (Ej: HashSet) Map: Un conjunto de pares
		 * clave-valor. Las claves deben ser únicas. (Ej: HashMap)
		 * 
		 * Array List.
		 * https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
		 * 
		 * Una colección List - Es una colección ordenada (respeta el orden en que se
		 * agregan) - Se permite elementos duplicados - Se basa en un array
		 * redimensionable que crece su tamaño, según crece la colección de elementos. -
		 * Esta colección es la mejor rendimiento tiene.
		 * 
		 * Sintaxis: ArrayList<object> varName = new ArrayList<>();
		 * 
		 * 
		 */

		// Definir una colección de tipo ArrayList de frutas
		ArrayList<String> fruits = new ArrayList<>();

		// Agregar un elemento con el método add()
		fruits.add("Jícama");
		fruits.add("Piña");
		fruits.add("Jitomate");

		System.out.println(fruits);

		// ArrayList permite elementos duplicados
		fruits.add("Mango");
		fruits.add("Mango");

		System.out.println(fruits);

		// Obtener el tamaño de la colección, size()
		System.out.println("N. de frutas: " + fruits.size()); // 4

		// Devolver un elemento en una posición especificada, get( int indice)
		System.out.println("Índice 2 es: " + fruits.get(2)); // Jitomate

		// Remover un elemento, remove(int indice), remove(Object)
		System.out.println("Removiendo el índice 3 :" + fruits.remove(3)); // Mango
		System.out.println(fruits);

		// Reemplzar un elemento, set(int indice, E element)
		System.out.println("Reemplazamos el índice 1: " + fruits.set(1, "Melón")); // Piña
		System.out.println(fruits);

		// Verificar si un elemento existe, contains(E element)
		System.out.println("Existe Papaya ? " + fruits.contains("Papaya")); // false
		System.out.println("Existe Mango ? " + fruits.contains("Mango")); // true

		// Iterar cada uno de los elementos usando for loop
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println("Fruta: " + fruits.get(i));
		}

		// Iterar cada uno de los elemento usando for enhanced
		for (String fruit : fruits) {
			System.out.println("For enhanced: " + fruit);
		}

		// ====================================================
		// Crear una colección de tipo ArrayList para marcas de
		// automóviles, agregar 4 marcas de autos.
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Mercedes");
		cars.add("Bmw");
		cars.add("Audi");
		cars.add("Jeep");

		System.out.println(cars);

		/*
		 * - Reemplazar el Bmw, por un BYD - Verificar que exista "Tesla" - Eliminar
		 * "Audi" - Mostrar el número de elementos totales en la colección - Imprimir
		 * cada uno de los elementos de la colección.
		 */
		// Reemplazar bmw por byd
		System.out.println("Reemplazamos el índice 1: " + cars.set(1, "BYD"));
		System.out.println(cars);

		// Existe Tesla?
		System.out.println("Existe Tesla? " + cars.contains("Tesla"));

		// Eliminar Audi
		System.out.println("Removiendo el índice 2: " + cars.remove(2)); // otra forma: cars.remove ("Audi")
		System.out.println(cars);

		// Mostrar número de elementos totales
		System.out.println("Número de cars: " + cars.size());

		// Imprimir cada uno de los elementos
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("Cars: " + cars.get(i));
		}

	}

}
