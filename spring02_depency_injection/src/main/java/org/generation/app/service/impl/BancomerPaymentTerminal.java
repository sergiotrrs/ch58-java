package org.generation.app.service.impl;

import org.generation.app.service.PaymentTerminal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary
public class BancomerPaymentTerminal implements PaymentTerminal {

	@Override
	public String charge(double amount) {
		return "El cajero BBVA (Bancomer) cobra la cantidad de " + amount;
	}

}
