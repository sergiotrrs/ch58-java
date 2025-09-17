package org.generation;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		/*
		 * La clase Scanner en Java se utiliza para 
		 * leer datos de entrada de diferentes fuentes, 
		 * como la consola, archivos o flujos de texto. 
		 * Es especialmente útil para interactuar con 
		 * el usuario mediante la consola.
		 * 
		 * La clase Scanner en Java es una clase útil 
		 * que se encuentra en el paquete java.util
		 * 
		 * System.in: Representa la entrada del teclado
		 */
		 String myString = new String("Uso de Scanner");
		 Car myCar = new Car();
		 // Crear una clase "Phone", instanciar un objeto y asignarlo a una variable
		 Phone myPhone = new Phone();
		 
		 Scanner sc = new Scanner( System.in );
		 
		 System.out.print("Cómo te sientes: ");
		 
			/*
			 * Lee una línea completa de entrada como cadena de texto.
			 * Devuelve todo el texto de la línea, excluyendo el
			 * carácter de salto de línea(\n).
			 * 
			 * Buffer: Memoria temporal donde se almacenan los datos
			 * de entrada antes de ser procesados.
			 */
		 String line = sc.nextLine();
		 System.out.println("Hola " + line);
		 
		 
		 /*
		  * Cerrar el scanner y liberar los recursos del sistema
		  */
		 sc.close();
		 System.out.println("Fin de mi programa");

	}

} // fin de la clase ScannerClass

class Car{

}

class Phone{
	
}
