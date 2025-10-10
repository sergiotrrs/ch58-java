package org.generation.app.service.impl;

import org.generation.app.service.PaymentTerminal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SantanderPaymentTerminal implements PaymentTerminal {

	{
	  System.out.println("Soy cajero de Santander y tengo vida");	
	}
	
	@Override
	public String charge(double amount) {		
		return "Cobrando de Santander la cantidad de " + amount;
	}	

}
