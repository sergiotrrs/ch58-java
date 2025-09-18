package org.generation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *  Las funciones(métodos) son fundamentales por:
 *  
 *  - Reutilización del código.
 *  - Organizar el código.
 *  - Facilidad de depuración.
 *  - Mejora la legibilidad.
 *  - Abstracción: encapsular la lógica de una tarea
 *  
 *  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
 *  Sintaxis de un método:
 *  
 *   <modificadores_de_acceso> <tipo_retorno> nombreMétodo( parámetros ) <lista_de_excepciones> {
 *   
 *      // cuerpo del método
 *   }
 *   
 *   Modificadores de acceso: public, protected, default, private.
 *   Tipo retorno: Especifica el tipo de valor que el método devolverá( return ).
 *   		Si el método no devuelve ningún valor(String, int, etc), 
 *   		se usa la palabra reservada "void".
 *   Nombre del método: Se recomienda comenzar el nombre con un verbo, 
 *   		seguido por un adjetivo, sustantivo, etc. Usar la convención camelCase.
 *   Parámetros: Lista de parámetros separados por coma.
 *   
 *   La firma del método es como:
 *   nombreMétodo( double, int, double, double  )
 *   
 *  
 */
public class UserProfile {
	
	/**
	 * Javadoc es el generador de documentación estándar de Oracle 
	 * para el lenguaje Java. Utiliza comentarios especiales en el 
	 * código fuente para generar una documentación completa en 
	 * formato HTML sobre las clases, métodos y atributos de un programa.
	 * 
	 * Usa comentarios para explicar lógica compleja, no para describir 
	 * lo que el código ya dice. Los comentarios ayudan a entender 
	 * rápidamente cómo usar tu código sin necesidad de leer toda 
	 * la implementación.
	 * 
	 * Las siguientes tags comienzan con @ que describen partes 
	 * específica del código. 
	 *  
	 * @param name nombre del usuario a formatear
	 * @return el nombre del usuario formateado(sin espacios y en minúsculas)
	 */
	String nameFormatted(String name){
		return name.toLowerCase().trim();
	}
	
	/**
	 * Registra una acción realizada por el usuario
	 * @param activityDescription La descripción de la acción realizada
	 */
	void registerActivity(String activityDescription) {
		// Obtener la fecha y hora actual del sistema
		LocalDateTime now = LocalDateTime.now();
		
		// Formatear la fecha y hora
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		// Appicar el formato a la fecha y hora actual
		String formattedTimeStamp = now.format(formatter);
		
		System.out.println(formattedTimeStamp +" : " +  activityDescription);				
	}
	
	

}
