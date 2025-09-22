package mx.santander;

/**
 *  Clase: Una clase es una componente fundamental de la programación
 *  orientada a objeto(OOP: Object oriented Programming). 
 *  Una clase es una plantilla que define el
 *  comportamiento(métodos) y las propiedades(atributos) de los objetos
 *  que se crean(instancian) a partir de ella. Una clase puede
 *  considerarse como un plano o un molde a partir del cual se crean
 *  los objetos( instanciar la clase).
 *  
 */
public class Atm {
	
	/*
	 * Atributos de instancia ( non-static fields ).
	 *   Variables que pertenecen a cada instancia (u objeto) de una clase. 
	 *   Esto significa que cada objeto creado a partir de la clase tiene 
	 *   su propia copia de estos atributos, por lo que pueden tener valores 
	 *   diferentes en cada instancia.
	 */
	int serialNumber;
	double balance;
	String address;
	
	
	/*
	 * Métodos de instancia ( non-static methods )
	 *    <modificarAcceso> <retorno> nombreMétodo( parámetros )
	 *  Son aquellos que pertenecen a una instancia específica de una clase. 
	 *  Estos métodos pueden acceder y modificar los atributos de instancia 
	 *  y son llamados sobre un objeto particular de la clase.  
	 *    
	 */
	double withdraw(double amount){
		balance = balance - amount;
		return balance;
	}
	
	/*
	 * Hacer un método que sirva para depositar dinero
	 */

}
