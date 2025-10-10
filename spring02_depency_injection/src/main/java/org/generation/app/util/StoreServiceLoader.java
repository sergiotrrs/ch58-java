package org.generation.app.util;

import org.generation.app.Spring02DepencyInjectionApplication;
import org.generation.app.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

/**
* CommandLineRunner es una interfaz en Spring Boot que se 
* usa para ejecutar código específico una vez que la 
* aplicación ha iniciado completamente. Es particularmente 
* útil para ejecutar tareas de inicialización o configuración 
* cuando se arranca la aplicación.
*/
@Configuration
public class StoreServiceLoader implements CommandLineRunner {

	@Autowired
	private StoreService storeService;
	
 	@Override
	public void run(String... args) throws Exception {
		System.out.println("Se realiza la configuración");
		
		double precioGansito = 20.00;
		storeService.checkout(precioGansito);
		
	}

}
