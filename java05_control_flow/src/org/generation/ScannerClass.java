package org.generation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		/*
		 * La clase Scanner en Java se utiliza para leer datos de entrada de diferentes
		 * fuentes, como la consola, archivos o flujos de texto. Es especialmente útil
		 * para interactuar con el usuario mediante la consola.
		 * 
		 * La clase Scanner en Java es una clase útil que se encuentra en el paquete
		 * java.util
		 * 
		 * System.in: Representa la entrada del teclado
		 */
		String myString = new String("Uso de Scanner");
		Car myCar = new Car();
		// Crear una clase "Phone", instanciar un objeto y asignarlo a una variable
		Phone myPhone = new Phone();

		File filePath = new File("datos.txt");

//		 Scanner sc = new Scanner( System.in );
		Scanner sc;
		try {
			sc = new Scanner(filePath);


		System.out.print("Cómo te sientes: ");

		/*
		 * Lee una línea completa de entrada como cadena de texto. Devuelve todo el
		 * texto de la línea, excluyendo el carácter de salto de línea(\n).
		 * 
		 * Buffer: Memoria temporal donde se almacenan los datos de entrada antes de ser
		 * procesados.
		 */
		String line = sc.nextLine();
		System.out.println("Hola " + line);

		System.out.print("Escribe tu número de la suerte: ");
		int myLuckyNumber = 0;
		if (sc.hasNextInt()) {
			myLuckyNumber = sc.nextInt();
		}
		/*
		 * Se recomienda usar nextLine() adicional para capturar el salto de línea que
		 * quedó tras la entrada de nextInt()
		 */
		sc.nextLine();

		System.out.println("Tu número es: " + myLuckyNumber);
		System.out.print("Escribe tu color favorito: ");
		String myFavoriteColour = sc.nextLine();
		System.out.println("Color favorito: " + myFavoriteColour);

		/*
		 * Cerrar el scanner y liberar los recursos del sistema
		 */
		sc.close();
		System.out.println("Fin de mi programa");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

} // fin de la clase ScannerClass

class Car {

}

class Phone {

}
