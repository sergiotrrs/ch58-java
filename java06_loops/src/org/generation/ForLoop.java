package org.generation;

public class ForLoop {

	public static void main(String[] args) {
		/*
		 * Sintaxis:
		 * 
		 * for( expresion_inicial ; comparacion; expresion_final) instrucción;
		 * 
		 * for( expresion_inicial ; comparacion; expresion_final){ instrucciones; }
		 * 
		 * Los bucles se usan para ejecutar un bloque de código repetidamente mientras
		 * se cumpla una condición. Son fundamentales para tareas como recorrer arrays,
		 * procesar colecciones de datos o simplemente repetir una acción un número
		 * determinado de veces.
		 * 
		 * Bucle for: Es ideal cuando sabes de antemano cuántas veces quieres que se
		 * repita el bloque de código.
		 * 
		 */
		for (int iteration = 1; iteration <= 5; iteration++) {
			System.out.println("Iteration: " + iteration);
		}
		// Cuántas veces itera el ciclo anterior? 5 veces, 1 ... 5

		/*
		 * Imprimir en consola, los números del 10 al 5 usando for loop Número 10 Número
		 * 9 Número 8... Número 5
		 */
		for (int iteration = 10; iteration >= 5; iteration--) {
			System.out.println("Iteration: " + iteration);
		}

		for (byte iteration = 0; iteration <= 10; iteration--) {
			System.out.println("Valor de iteración: " + iteration);
		}
		// Cuántas veces se itera el ciclo anterior?
		// A) No se ejecuta
		// B) 11 veces **
		// C) Realiza un ciclo infinito
		// D) Realiza varias iteraciones

		for (int i = 0; i < 5; i++) {
			System.out.println("Valor de i: " + i);
			break;
			// System.out.println("Fin del ciclo for");
		}
		// Cuántas veces se itera el ciclo anterior?
		// A) No se ejecuta
		// B) 5 veces
		// C) Realiza un ciclo infinito
		// D) Se ejecuta 1 vez ***

		int iteracion = 1;
		for (;;) {
			if (iteracion > 5)
				break;
			System.out.println("Núm. Iteración: " + iteracion++);
		}

		System.out.println("Valor final de iteracion: " + iteracion);
		// A) No se ejecuta
		// B) 5
		// C) 6 **
		// D) 1

		/*
		 * Una label (etiqueta) en Java es un identificador que le pones a un bucle para
		 * poder controlarlo desde adentro de otro bucle anidado.
		 * 
		 * Su uso principal es con las sentencias break y continue para especificar a
		 * cuál bucle de una serie de bucles anidados quieres afectar. Sin una etiqueta,
		 * break o continue siempre se aplican al bucle más interno.
		 */
		ciclo: for (int i = 0; i < 5; i++) {
			System.out.println("Valor de i: " + i); // 0, 1, 2, 3, 4
			if (i > 3)
				break ciclo;
		}
		// Qué valores imprime valor de i?

		
		
		// Tabla de multiplicación del 1 al 10
		principal: 
			for (int i = 1; i <= 5; i++) {

			secundario: 
				for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
				if (j >= 7)
					break principal;
			}
		}
		
		
		for (int i = 1; i <= 5 ; i++) {
			if (i == 2)	continue;
			System.out.println("Valor de i: " + i);
		}
		
		/*
		 * Imprimir los números pares del 1 al 20
		 * Salida:
		 *  2
		 *  4
		 *  6...
		 *  18
		 *  20
		 * 
		 */

	}

}
