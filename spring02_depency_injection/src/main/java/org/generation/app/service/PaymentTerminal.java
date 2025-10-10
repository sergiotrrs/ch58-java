package org.generation.app.service;

/*
 * 1. La Abstracción (El Contrato)
 * Esta interfaz no cambia. Define lo que una terminal 
 * debe poder hacer.
 */
public interface PaymentTerminal {
	String charge(double amount);
}
