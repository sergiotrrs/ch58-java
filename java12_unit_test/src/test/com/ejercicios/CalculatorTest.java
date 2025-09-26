package test.com.ejercicios;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ejercicio.Calculator;

class CalculatorTest {

	@Test
	@DisplayName("Suma dos números enteros positivos")
	void addTest() {
		Calculator calculator = new Calculator();
		assertEquals(10, calculator.add(4, 6), "Suma 4 y 6 debe dar 10");
	}

}
