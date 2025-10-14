package com.monkey.tower.app.util;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.monkey.tower.app.model.Role;
import com.monkey.tower.app.repository.RoleRepository;


/**
* CommandLineRunner es una interfaz en Spring Boot que se 
* usa para ejecutar código específico una vez que la 
* aplicación ha iniciado completamente. Es particularmente 
* útil para ejecutar tareas de inicialización o configuración 
* cuando se arranca la aplicación.
* 
* @Order(n) se utiliza para controlar el orden de ejecución 
* de los beans que implementan interfaces como CommandLineRunner 
* o ApplicationRunner
*/
@Component
@Order(1)
@Profile("devH2")
public class RoleDataLoader implements CommandLineRunner{

	/**
	 *  - Logger permite definir niveles( TRACE, DEBBUG, INFO, WARN, ERROR).
	 *  - Redirigir el log a archivos, bases de datos o consola.
	 *  - Personalizar el formato.
	 *  - Se integra mejor con otras herramientas para un monitoreo avanzado
	 */
	private static final Logger log = LoggerFactory.getLogger( RoleDataLoader.class);
	
	private final RoleRepository roleRepository;
		
	public RoleDataLoader(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}


	@Override
	public void run(String... args) throws Exception {
		// System.out.println("===== Se Ejecuta RoleDataLoader =====");
		log.info("===== Se Ejecuta RoleDataLoader =====");
		
		roleRepository.save(new Role(1L, "ADMIN", "Acceso total al sistema") );
		// TODO 1: Crear 3 roles más (Customer, Warehouse-Manager, Support-agent)
		roleRepository.save(new Role(2L, "Warehouse-Manager", "Acceso al almacen"));
		roleRepository.save(new Role(3L, "Support-Agent", "Soporte del sistema"));
		roleRepository.save(new Role(4L, "Customer", "Acceso a visualizar productos"));
		
		// ============ Obtener todos los roles ===================
		Iterable<Role> roles = roleRepository.findAll();
		for (Role role : roles) {
			log.info("Role Description:" + role);
		}
		
		// ============ Encontrar un role =========================
		Optional<Role> optionalRole = roleRepository.findById(4L);		
		if( optionalRole.isPresent()) {
			Role existingRole = optionalRole.get();
			log.info("Role encontrado: " + existingRole);
		} else {
			log.warn("El role no fue encontrado");
		}
		
	}

}
