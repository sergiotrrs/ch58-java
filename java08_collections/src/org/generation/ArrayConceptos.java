package org.generation;

public class ArrayConceptos {

	public static void main(String[] args) {
		/*
		 * Las variables de tipo array se definen con corchetes [] Los corchetes pueden
		 * ir antes o después de la variable ej. int[] myArray; int myArray[];
		 * Pantalon[] pantalones;
		 * 
		 * Para los array se debe asignar la cantidad de elementos que contendrá. Una
		 * vez definido, el arreglo no púede cambiar su tamaño
		 */

		byte[] colours;
		colours = new byte[4];

		byte[] coloursCode = { 2, 10, 127, -128 };

		// Definir un arreglo de 4 elementos de tipo String.
		// para que contenga el nombre de frutas

		String[] fruits;
		fruits = new String[4];

		String[] fruitsMarket = { "Apple", "Orange", "Banan", "Grape" };

		System.out.println(fruitsMarket);

		/*
		 * Uso de los arreglos: Ideal cuando sabes exactamente cuántos elementos
		 * necesitas almacenar.
		 * 
		 * Si trabajas con datos primitivos y quieres optimizar el uso de memoria. Los
		 * arreglos primitivos son más eficientes que las colecciones que solo pueden
		 * guardar objetos.
		 */
		// Aceder al elemento por su indice, los arreglos son índice cero

		System.out.println("Accediendo al indice 1: " + fruitsMarket[1]); // Orange

		// Reemplazar un elemento
		fruitsMarket[2] = "Jícama";

		// Iterar todos los elementos del arreglo
		for (int i = 0; i < fruitsMarket.length; i++) {
			System.out.printf("Indice: %d, valor: %s %n", i, fruitsMarket[i] );
		}
		
		/*
		 * Bucle for-each() (enhanced for)
		 * Introducido en Java 5, el for-each es una forma simplificada 
		 * del bucle for diseñada específicamente para iterar sobre 
		 * los elementos de un array o una colección (como ArrayList, 
		 * HashSet, etc.). Es más legible y menos propenso a errores, 
		 * ya que no necesitas manejar un índice.
		 */
		for(String fruit : fruitsMarket ) {
			System.out.println("Valor: " + fruit);
		}
		
		// String myFavoriteFruit = fruitsMarket[50];
		// Index 50 out of bounds for length 4

	}

}
