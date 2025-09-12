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
		
	}

}
