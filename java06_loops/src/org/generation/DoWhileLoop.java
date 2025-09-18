package org.generation;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		/**
		 * Ciclo Do-While
		 * Ejecuta un bloque de código al menos una vez
		 * antes de evaluar la condición.
		 * 
		 * Sintaxis:
		 *     
		 *    do {
		 *    
		 *     Instrucciones;
		 *     
		 *    } while (condición);
		 * 
		 */
		int valor = 10;
		do {
			System.out.println("Valor: " +  valor++);
		} while( valor < 5 );
		
		/*
		 * Usando la clase Scanner pide un número al usuario
		 * hasta que ingreso un valor positivo.
		 * 
		 * En caso de ser un número negativo seguir preguntando.
		 */
        Scanner scanner = new Scanner(System.in);
        int userNumber;

        // Pide un número hasta que el usuario ingrese uno positivo
        do {
            System.out.print("Por favor, ingresa un número positivo: ");
            userNumber = scanner.nextInt();
        } while (userNumber <= 0);

        System.out.println("¡Gracias! Ingresaste el número: " + userNumber);
        scanner.close();

	}

}
