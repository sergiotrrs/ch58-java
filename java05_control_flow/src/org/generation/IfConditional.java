package org.generation;

public class IfConditional {

	public static void main(String[] args) {
		/**
		 * 
		 * Flujos de control: las sentencias de flujo de control interrumpen el flujo de
		 * ejecución empleando toma de decisiones, bucles y ramificaciones lo que
		 * permite que el programa ejecute condicionalmente bloques de código
		 * particulares.
		 * 
		 * Sintaxis de la condicional if Si la condicional es verdadera, se ejecuta la
		 * instrucción de if
		 * 
		 * if ( condicional ) sentencia;
		 * 
		 * if ( condicional ) { 
		 *    sentencias; 
		 * }
		 * 
		 * if ( condicional ) sentencia; 
		 * else sentencia_Si_condicional_es_falsa;
		 * ------------------------------------------------------ 
		 * if ( condicional )
		 *   sentencia; 
		 * else if ( nueva_condicional) 
		 *   sentencia; 
		 * else if ( n_condición )
		 *   sentencia; 
		 * else 
		 *   sentencia;
		 * 
		 */
		int condicion = 0;
		String resultado;
		
		if( condicion == 1) resultado = "la condicion es 1";
		else 
			if( condicion == 2) resultado = "la condicion es 2";
			else 
				if( condicion == 3 ) resultado = "la condicion es 3";
				else resultado = "No cumple con ninguna condición anterior";
		
		
		/*
		 * Operador ternario.
		 * 
		 * Sintaxis: expresión ? respuesta_si_es_verdadera : si_es_falsa
		 *
		 * El operador ternario en Java, también conocido como operador 
		 * condicional, es una forma concisa de escribir una sentencia 
		 * if-else simple. Permite asignar un valor a una variable 
		 * o ejecutar una expresión basándose en una condición booleana.
		 *
		 * Si las expresiones o la condición son muy complejas, el 
		 * operador ternario puede volverse difícil de leer y entender. 
		 * En esos casos, es preferible usar una sentencia if-else 
		 * tradicional.
		 *
		 * Realizar el ejercicio anterior usado el operador ternario
		 */
		
		int number = 10;
		String message = number >= 10 ?  "Es mayor" : "Es menor";
		
		/*
		 *  Evaluar una variable que indique si la persona es miembro
		 *  premium o no.
		 *  Si es miembro premium, obtiene 15% de descuento, sino 5%
		 *  Imprimir en consola el porcentaje asignado
		 *  - Realizar el ejercicio usando if-else y el operador ternario
		 */
		boolean miembroPremium = false;
		
		if (miembroPremium)
			System.out.println("Obtiene 15% de descuento");
		else
			System.out.println("Obtiene un 5% de descuento");
		
		String message2 = miembroPremium ? "Obtiene 15% de descuento" : "Obtiene 5% de descuento";
		System.out.println(message2);
	}

}
