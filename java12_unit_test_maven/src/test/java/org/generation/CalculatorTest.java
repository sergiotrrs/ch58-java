package org.generation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

@DisplayName("Pruebas unitarias de la clase Calculator")
public class CalculatorTest {
	
	@Test
	@DisplayName("Sumatoria de números positivos")
	void addTest() {
		Calculator cal = new Calculator();
		assertEquals( 5, cal.add(3, 2), "Suma 3 y 2 debe ser 5");
		assertEquals( 100, cal.add(30, 70), "Suma 30 y 70 debe ser 100");
		assertEquals( 1_000_000, cal.add(500_000, 500_000), "Suma 500k y 500k  debe ser 1 millón");
		
	}
	
	// Probar el método de resta
	
	
	// Probar el método de división

}
