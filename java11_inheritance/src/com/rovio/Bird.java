package com.rovio;


/**
 *  Las clases abstractas son clases que no se pueden instanciar.
 *  Estas clases se utilizan como modelos(plantillas) para
 *  crear subclases concretas que se puedan instanciar.
 *  
 *  una clase abstracta se declara en la firma de la clase
 *  con la palabra reservada "abstract"
 *  
 *  La clase abstracta puede contener métodos abstractos y
 *  métodos concretos.
 *  
 *  Los métodos abstractos no tienen implementación. La implementación
 *  se debe realizar en las subclases concretas.
 *  
 *  Las clases abstractas se recomienda utilizar para
 *  clases que estén estrechamente relacionadas ( is-A )
 */
abstract public class Bird implements Smashable {
	private String name;
	private String color;
	
	public Bird(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bird [name=");
		builder.append(name);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}

	/*
	@Override
	public String toString() {
		return "Bird [name=" + name + ", color=" + color + "]";
	}*/

	final public void launch() {
		System.out.println(this.name + " ha sido lanzado");
	}
		
	/**
	 *  Un método abstracto no tiene implementación, solo
	 *  la definción del método.
	 *  Termina con punto y coma.
	 *  
	 *  Si tienes un método abstracto, tienes la obligación
	 *  de hacer tu clase abstracta.
	 */
	public abstract void useSpecialAbility();
	
	@Override
	public void onImpact() {
		System.out.println( this.name + " se impacta");
		
	}

}







