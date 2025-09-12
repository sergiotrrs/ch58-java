package org.generation;

public class ArithmeticOperator {

	public static void main(String[] args) {
	/* Arithmetic Operators
	  
 	+	Additive operator (also used for String concatenation)
	-	Subtraction operator
 	*	Multiplication operator
	/	Division operator
	%	Remainder operator
	 
	 Cuando se realizan operaciones entre tipo de datos diferentes
	 el resultado es promovido al de mayor jerarquía para evitar
	 pérdida de precisión.
	 
	 Ejemplo:   int * long = long
	 
	 *  1.- byte (8 bits)
	 *  2.- short (16 bits)
	 *  3.- int (32 bits)
	 *  4.- long (64 bits)
	 *  5.- float (32 bits)
	 *  6.- double (64 bits)
	 
	 */
		double value =  5.2;
		int operatorA = (int)value;
		System.out.println(operatorA); // 5
		int operatorB = 6;
		int sum = operatorA + operatorB;
		System.out.println("Sumatoria: " + sum); // 11
		
		int difference = operatorA - operatorB;
		System.out.println("Resta: " + difference); // -1
		
		double product = operatorA * 1.2;
		System.out.println("Multiplicación: " + product); // 6.0
		
		
		int product2 = (int)(operatorA * 1.2); // operatorA es de 32 bits(int)
		System.out.println("Multiplicación 2: " + product2); // 6 (int)
		
		// A partir de Java 10, se puede usar la palabra reservada var
		// para inferir el tipo de dato
		/*
		 *  Palabra reservada "var"
		 *  Se introdujo en la versión de Java 10.
		 * 
		 *  Se utiliza para la inferencia de tipo de variable locales.
		 *  
		 *  Uso principal: simplica la declaración de variables locales,
		 *     especialmente cuando el tipo de dato es largo.
		 *     
		 *  Consideraciones:
		 *   - Solo para variables locales
		 *   - La variable debe ser inicializada en la misma declaración.
		 */
		var product3 = (int)(operatorA * 1.2);		
		System.out.println(product3);
		
		/*
		 * Java tiene varios tipos de datos numéricos para 
		 * optimizar el uso de memoria y mejorar el rendimiento, 
		 * ofreciendo flexibilidad para elegir el tipo adecuado 
		 * según el contexto y las necesidades del programa.
		 * 
		 * En ciclos o en bloques de código donde se realizan 
		 * muchas operaciones repetitivas, como iteraciones, 
		 * es recomendable usar tipos como int para evitar 
		 * conversiones innecesarias entre tipos y así 
		 * mejorar el rendimiento.
		 * 
		 */
		/*
		byte interes = 1;
		byte resultado;
		for (int i = 0; i < 10; i++) {
			resultado = (byte)(5 * interes);
		}
		*/
		int interes = 1;
		int resultado;
		for (int i = 0; i < 10; i++) {
			resultado = 5 * interes;
		}
		
		
	}

}
