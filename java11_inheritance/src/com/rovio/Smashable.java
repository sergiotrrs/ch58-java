package com.rovio;


/**
 *  Una interfaz es una declaración formal de un contrato, en la
 *  cuál los métodos no contienen implementaciones.
 *  Es similar a los métodos abstractos.
 *  
 *  Una clase puede implementar varias interfaces.
 *  
 *  Las interfaces son adecuadas para proporcionar funcionalidad
 *  a clases que no están relacionadas entre si.
 *  
 *  
 *  Para patrones de diseño, se suele utilizar interfaces.
 */

/**
 * Habilidad de poder impactar contra algo
 * Un Bird y Pig pueden impactarse
 */
public interface Smashable {
	// NOTA: las interfaces no tiene constructores
	
	/*
	 * Los atributos en las interfaces son public, final, static
	 * boolean isSmashable = true;
	 */
	
	/*
	 * Los métodos por default son public, abstract
	 */
	void onImpact();
	
	/*
	 * A partir de la versión 8 de Java, se puede tener
	 * métodos con implementaciones. Estos deben ser default  
	 */
	default String greeting() {
		return "Soy un personaje de Angry Birds";
	}
	
}

interface DataBase{
	void connect();
	String getField();
	void closeConnection();
}




