package org.generation;

public class SwitchConditional {

	public static void main(String[] args) {
		/*
	     * La sentencia switch en Java es una estructura de 
	     * control que permite ejecutar diferentes bloques 
	     * de código basándose en el valor de una variable 
	     * o expresión. Es una alternativa más limpia a una 
	     * serie de sentencias if-else if.
	     * 
	     * Puedes usar switch con los siguientes tipos de datos:
	     * Primitivos: int, byte, short, char.
	     * Clases Wrapper: Integer, Byte, Short, Character.
	     * String (desde Java 7).
	     * enum (tipos enumerados).
	     * 
	     * Switch usa el método equals para comparar los Strings.
	     * 
	     * Sintaxis:
	     *   switch( evaluación){
	     *     case 1:
	     *           sentencias;
	     *           break;
	     *     case 2:
	     *           sentencias;
	     *           break;
	     *     default:
	     *           sentencias;      
	     *   }
	     */
		
		String userRole = "VIEWER";
		
		switch( userRole ) {
		case "ADMIN" :
			System.out.println("Acceso al panel de administrador");
			break;
		case "EDITOR":
			System.out.println("Acceso a la edición de contenido");
			break;
		case "VIEWER":
			
		case "CUSTOMER":
			System.out.println("Acceso a la vista pública");
			break;
		default:
			System.out.println("Rol desconocido, acceso denegado");
			// break;
		} // fin de condicional switch
		
	}

}
