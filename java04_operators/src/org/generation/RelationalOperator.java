package org.generation;

public class RelationalOperator {

	public static void main(String[] args) {
		/*
		 *  Operadores de igualdad, relacionales y condicionales
		   
		   ==      equal to
		   !=      not equal to
		   >       greater than
		   >=      greater than or equal to
		   <       less than
		   <=      less than or equal to		
		 
		 */
		int value1 = 1;
	    int value2 = 2;
	    
	    if( value1 == value2 ) // false
	    	System.out.println("value1 == value2"); // no se imprime
	    
	    if(value1 != value2) // true
	    	System.out.println("value1 != value2"); // se imprime
	    
	    if(value1 > value2) // false
	    	System.out.println("value1 > value2"); // no se imprime
	    
	    if(value1 < value2) // true
	    	System.out.println("value1 < value2"); // se imprime
	    
	    if(value1 <= value2) // true
	    	System.out.println("value1 <= value2"); // se imprime 
	    
	    if(value1 <= value2 && value1 > 10)    ; 	    
	    System.out.println("Siempre se imprime");
	    
	    // No se puede realizar
	    // if( value1 < "10" );
	    
	    /**
	      *  Convertir un String a un número
	      *  La clase wrapper (o envoltorio) es una clase que 
	      *  encapsula un tipo primitivo en un objeto. Esto 
	      *  permite tratar los tipos primitivos (int, char, boolean, etc.)
	      *  como objetos
	      *  
	      *  Ventajas de los primitivos:
	      *   - Más rápidos en rendimiento.
	      *   - Menor consumo de memoria.
	      *   
	      *  Desventajas de los primitivos:
	      *   - No se puede usar en colecciones genéricas
	      *   - No poseen métodos ni atributos
	      *   - No pueder ser null
	      */
	    String numberString = "10";
	    
	    byte myValueByte = Byte.parseByte(numberString);
	    if(myValueByte < 15) System.out.println("myValue es menor a 15");
	    
	     /*
	      * Realizar la comparación de numberString
	      * con el valor de 30
	      * nota: se debe convertir numberString a un tipo short 
	      */
	    short myValueShort = Short.parseShort(numberString);
	    if(myValueShort < 30) System.out.println("myValueShort es menor a 30");

	}

}
