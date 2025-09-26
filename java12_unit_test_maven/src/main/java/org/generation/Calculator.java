package org.generation;

public class Calculator {
	
	public int add(int a , int b) {
		return a  + b;
	}
	
	public double add(double a, double b){
		return a + b;
	}
	
	// PAra evitar la pérdida de precisión se recomienda la clase BigDecimal
	
	/// Metodo que haga la resta de dos numeros
	public int subtraction(int a, int b) {
		return a - b;
	}

	// Metodo que realice la division de dos numeros
	public int division(int a, int b) {
		if(b == 0) throw new IllegalArgumentException("No se puede dividir por cero");
		return a / b;
	}


}
