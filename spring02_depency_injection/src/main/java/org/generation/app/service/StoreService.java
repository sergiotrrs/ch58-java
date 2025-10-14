package org.generation.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

//	@Autowired // Spring inyectará el bean
//	@Qualifier("bancomer")
	private PaymentTerminal terminal;

	
	public StoreService(@Qualifier("bancomer") PaymentTerminal terminal) {
		this.terminal = terminal;
	}

	public void checkout(double amout) {
		System.out.println("==== Sistema de cobro ======");
		System.out.println(this.terminal.charge(amout));

	}
}
