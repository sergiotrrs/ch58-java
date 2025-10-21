package com.monkey.tower.app.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.monkey.tower.app.dto.RoleDto;
import com.monkey.tower.app.model.Role;
import com.monkey.tower.app.repository.RoleRepository;
import com.monkey.tower.app.service.impl.RoleServiceImpl;

/**
 * Verificar la lógica de negocio dentro de RoleServiceImpl de forma aislada.
 * Para lograrlo, "mockearemos" (simularemos) la capa de repositorio
 * (RoleRepository) usando Mockito. Esto significa que las pruebas se ejecutan
 * sin necesidad de una base de datos real y se centran únicamente en el
 * comportamiento del servicio.
 * 
 * Mockito ayuda a asegurarte que tu clase interactúa correctamente con
 * sus dependencias, sin necesidad de ejectuar esas dependencias realmente.
 */
@ExtendWith(MockitoExtension.class) // STEP 1 Habilita el uso de anotaciones de Mockito
public class RoleServiceImplTest {
	
	// STEP 2, Crear un Mock de la capa repository
	@Mock
	RoleRepository roleRepository;
	
	// STEP 3, Crear un instancia de RoleServiceImpl e inyectar el mock(roleRepository)
	@InjectMocks
	RoleServiceImpl roleService;
	
	Role admin;
	Role customer;
	
	@BeforeEach
	void setUp() {
		// preparar objetos de prueba reutilizables
		admin = new Role(1L, "ADMIN", "Administrador del sitio");
		customer = new Role(4L, "CUSTOMER", "Cliente del sitio");		
	}
	
	void testFindAll() {
		
		// STEP 4 Arrange: Preparar el escenario
		List<Role> roles = Arrays.asList(admin, customer);
		
		// ******* STEP 5 Definir el comportamiento del Mock ****************
		when(roleRepository.findAll()).thenReturn(roles);
		
		// STEP 5 Act: Ejecutamos el método a probar
		Iterable<RoleDto> rolesDto = roleService.findAll();
		
		// STEP 6 Assert: Verficar los resultados.
		assertNotNull(rolesDto);		
	}
	

}
