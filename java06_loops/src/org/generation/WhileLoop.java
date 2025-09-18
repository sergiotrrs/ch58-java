package org.generation;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		/**
		 * Bucle While
		 * Mientras la condición sea verdadera, se realiza un nuevo ciclo.
		 * 
		 * Sintaxis:
		 *     
		 *     while( condicion ) instruccion;
		 *     
		 *     while( condicion ) {
		 *        instrucciones;
		 *     }
		 * 
		 * Es útil cuando no sabes cuántas iteraciones se necesitarán.
		 * 
		 */
		int stock = 5; //  Número de productos disponibles
		
		// Iterar mientras queden productos
		while( stock > 0) {
			System.out.println("Vendido un producto, quedan: " + --stock );
		}
		System.out.println("Productos agotados");
				
		
		/*
		* Mostrar en la consola un mensaje de bienvenida
		* 
		* Posteriormente preguntar al usuario si desea
		* seguir activo, si la respuesta es "y"("s") volver a mostrar
		* el mensaje de bienvenida, en caso contrario despedirse
		* y terminar el programa
		*/
		Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("¡Bienvenido al sistema de lloración!"); 
            
            System.out.print("¿Deseas seguir llorando? (s/n): ");
            char respuesta = sc.nextLine().toLowerCase().charAt(0);
            
            if (respuesta != 's') { // Si la respuesta es "n", termina el programa
                System.out.println("Adios, se feliz :) ");
                continuar = false;
            }
        }
        sc.close();
		
		

	}

}
