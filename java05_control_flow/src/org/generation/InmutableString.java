package org.generation;

public class InmutableString {

	public static void main(String[] args) {
		/*
		 * En Java, los strings son inmutables, lo que significa 
		 * que una vez que se crea un objeto String, su valor 
		 * no puede ser cambiado. Cualquier operación que parezca 
		 * modificar un String en realidad crea un nuevo objeto 
		 * String en memoria.
		 */
		String originalString = "El gato";
		String modifiedString = originalString.concat(" con botas"); // El gato con botas
		
		originalString = "Ratones ciegos";
		originalString = "El gato";
		String newObjectString = new String("El gato");
		
		/*
		 *  El operador de igualdad (==) en los objetos, compara
		 *  la referencia.
		 */
		 //      0xFA13    ==    0xFA13
		if( originalString == "El gato") {
			System.out.println("El texto es el mismo");
		} else {
			System.out.println("El texto es diferente");
		}
		
		//      0xFA13    ==    0xCCBB
		if( originalString == newObjectString) {
			System.out.println("El string es el mismo");
		} else {
			System.out.println("El string es diferente");
		}
		

		/*
		 * El método .equals() en un String de Java se utiliza 
		 * para comparar si el contenido (la secuencia de 
		 * caracteres) de dos strings es exactamente el mismo.
		 */
		//     "El gato"   ==  "El gato"
		if( originalString.equals(newObjectString) ) {
			System.out.println("El valor es el mismo");
		} else {
			System.out.println("El valor es diferente");
		}
		
		/*
		 * El Garbage Collector (GC) o Recolector de Basura es un 
		 * proceso automático en la Máquina Virtual de Java (JVM) 
		 * que se encarga de gestionar la memoria.
		 * 
		 * Su principal objetivo es liberar la memoria que ocupan 
		 * los objetos que ya no están en uso por la aplicación, 
		 * previniendo así fugas de memoria y el agotamiento de 
		 * la misma.
		 * 
		 * No necesitas llamar al Garbage Collector explícitamente. 
		 * Es un proceso automático y altamente optimizado que la 
		 * JVM ejecuta cuando lo considera necesario.
		 */
		originalString = null;
		
		
	}

}
