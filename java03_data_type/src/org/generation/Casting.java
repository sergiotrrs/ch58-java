package org.generation;

public class Casting {

	public static void main(String[] args) {
		/*
		 *  El orden de la jerarquía depende del tamaño de bits
		 *  y la precisión. El orden de jerarquía de los datos
		 *  primitivos de menor a mayor es:
		 *  
		 *  1.- byte (8 bits)
		 *  2.- short (16 bits)
		 *  3.- int (32 bits)
		 *  4.- long (64 bits)
		 *  5.- float (32 bits)
		 *  6.- double (64 bits)
		 * 
		 *  El Java las conversiones de tipo se llaman type casting.
		 *  Hay dos tipos principales: implicit casting y explicit casting)
		 * 
		 */
		
		
		// ================== Conversión implícita ==========================
		// Java convierte automáticamente un tipo más pequeño a uno más grande
		byte productStatusCode = 3; // variable de 8 bits
		short statusCode = productStatusCode;
		
		// ================== Conversión explícita ==========================
		/*
		 * Se debe hacer manualmente colocando el tipo de dato entre paréntesis
		 * delante del valor a convertir.
		 * Es necesario cuando se convierte un tipo de dato más grnade a uno
		 * más pequeño.
		 * 
		 * ¡Cuidado! La conversión implícita puede llevar a la pérdida de 
		 * información si el valor del tipo más grande excede la capacidad
		 * del tipo más pequeño.
		 * 
		 * sintaxis:
		 *     (TipoAConvertir) dato
		 */
		short calificacionBuroDeCredito = 131;
		byte calificacion = (byte)calificacionBuroDeCredito;
		System.out.println("Valor de calificación: " + calificacion); // -125
		
		short numCohort = 48;
		byte cohort = (byte)numCohort;
		System.out.println(cohort);
		

	}

}
