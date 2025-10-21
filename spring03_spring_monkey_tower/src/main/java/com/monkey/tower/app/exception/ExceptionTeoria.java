package com.monkey.tower.app.exception;

public class ExceptionTeoria {
	
	public static void main(String[] args) {

/**
 * Una excepción es una situación no esperada
 * durante la ejecución de un programa.
 * 
 * Existen dos tipos de excepciones.
 * 
 * A) Checked Exceptions: Son  excepciones que se heredan
 * de la clase Exceptions. Se tiene que declarar la excepción
 * en la firma del método o bien manejar la excepción con 
 * el bloque try-catch.
 * 
 * B) Unchecked Exceptions: Son excepciones que se heredan
 * de la clase RuntimeException. No se está obligado a procesarlas.
 * Es opcional el uso de try-catch o declar en la firma del método.
 * 
 * Las excepciones de Error, son arrojadas por la JVM, son errores
 * de los que no se pueden recuperar.
 * 
 * Manejo de excepciones con el bloque try-catch
 * 
 * Sintaxis:
 * 
 *  try{
 *  
 *  }
 *  catch(exception e  ){
 *  
 *  }
 * 
 * try: bloque que contendrá sentencias que pudieran generar una excepción.
 * catch: se ejecutará si ocurre una excepción en try
 * finally: se ejecutará después de try o catch.
 * 
 * El stacktrace de una excepción es el conjunto
 * de mensajes desde el origen de la excepción
 * hasta la última clase que recibe la excepción.
 * 
 * 
 */
		System.out.println("Inicio de mi programa");
		try {
			double division = 4 / 3;
			int[] numbers = {3,4};
			numbers[100] =  4;
			
		} catch(ArithmeticException e) {
			System.err.println("Ocurrió un problema aritmético");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Ocurrió un problema en la ejecución de tu programa");
			e.printStackTrace();
		} finally {
			System.out.println("Fin de mi programa");			
		}
		

		
		
		
	}

}
