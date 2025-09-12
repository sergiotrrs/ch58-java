package org.generation;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * Los operadores evaluan valores booleanos
		 * Tienen el comportamiento de corto circuito: El segundo operador
		 *  solo se evalua si es necesario
		 
		   && conditional AND
		   ||  conditonal OR
		 
		   Operador AND:
		   Si el primer operando de una expresión && es false, 
		   el resultado de la expresión completa será false 
		   independientemente del valor del segundo operando. 
		   Por lo tanto, Java no evalúa el segundo operando.
		 
		   Operador OR:
		   Si el primer operando de una expresión || es true, 
		   el resultado de la expresión completa será true 
		   independientemente del valor del segundo operando. 
		   Por lo tanto, Java no evalúa el segundo operando.
		   
		   Ventajas del corto circuito:
		   - Evita la ejecución innecesaria de código, lo que 
		   puede ahorrar tiempo de procesamiento, especialmente 
		   si el segundo operando implica una operación costosa 
		   (como una llamada a un método complejo o una consulta 
		   a base de datos).
		   - Permite escribir condiciones seguras donde el segundo 
		   operando podría causar un error si el primero no cumple 
		   cierta condición (por ejemplo, verificar si un objeto 
		   es null antes de acceder a sus miembros).
		 */
		
		  int value1 = 1;
	      int value2 = 2;
	      
	        
	      if( (value1 == 1) && (value2 == 2) )
	          System.out.println("value1 is 1 AND value2 is 2"); 
	      
	      if( (value1 == 1) || (value2 == 1) )
	            System.out.println("value1 is 1 OR value2 is 1");
		
	      int x = 10, y = 5, z = 20;
	      
	      boolean resultado1 = (x > y) && (z > x); // true
	      boolean resultado2 = (x < y) && (z > x); // false
	      
	      boolean resultado3 = (x < y) || (z > x); // true
	      boolean resultado4 = (x < y) || (z < x); // false
	      
	      // Ejemplo para prevenir NullPointerException
	      String name = null;
	      
	      if ( name!= null  &&  name.isEmpty() ) {
	    	  System.out.println("El nombre está vacío");
	      } else {
	    	  System.out.println("El nombre es null o no está vacío");
	      }
	}

}
