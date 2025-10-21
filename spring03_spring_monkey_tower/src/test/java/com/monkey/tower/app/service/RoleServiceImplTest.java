package com.monkey.tower.app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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
	
	@Test
	void testFindAll() {
		
		// STEP 4 Arrange: Preparar el escenario
		List<Role> roles = Arrays.asList(admin, customer);
		
		// ******* STEP 5 Definir el comportamiento del Mock ****************
		when(roleRepository.findAll()).thenReturn(roles);
		
		// STEP 5 Act: Ejecutamos el método a probar
		Iterable<RoleDto> rolesDto = roleService.findAll();
		
		// STEP 6 Assert: Verficar los resultados.
		assertNotNull(rolesDto);
		assertEquals( 2, ((List)rolesDto).size() );
		RoleDto roleCustomerDto = (RoleDto) ((ArrayList)rolesDto).get(1); 
		assertEquals("CUSTOMER",  roleCustomerDto.getNombre() );
		
		// Verificar que el método reoleRepository.findAll() se llama una sola vez
		verify( roleRepository, times(1)).findAll();
	}
	
	@Test
	@DisplayName("findById: Debe devolver un rol cuando el ID exista")
	void testFindByIdFound() {
		// STEP 4 Arrange: Preparar el escenario
		when(roleRepository.findById(1L)).thenReturn(Optional.of(admin));
		
		// STEP 5 Act: Ejecutamos el método a probar
		RoleDto roleAdminDto = roleService.findById(1L);
		
		// STEP 6 Assert: Verficar los resultados.
		assertNotNull(roleAdminDto);
		assertEquals("ADMIN", roleAdminDto.getNombre());
		assertEquals(1L, roleAdminDto.getIdentificador());
		assertEquals("Administrador del sitio", roleAdminDto.getDescripcion());
		verify( roleRepository, times(1)).findById(1L);
		
	}
	
	@Test
	@DisplayName("findById: Debe lanzar una excepción si el ID no existe")
	void testFindByIdNotFound() {
		// STEP 4 Arrange: Preparar el escenario
		when(roleRepository.findById(10L)).thenReturn(Optional.empty());
		
		// STEP 5 y 6 Act & Assert: Ejecutamos el método a probar
		IllegalStateException exception = assertThrows( IllegalStateException.class, ()-> roleService.findById(10L) );  
		assertEquals("Role does not exist with id 10", exception.getMessage());
		
	}
	
	@Test
    @DisplayName("update: Debe actualizar y devolver el rol si el ID existe")
    void testUpdateFound() {
        // Arrange
        Long roleId = 1L;
        RoleDto updatedDto = new RoleDto(roleId, "ADMIN_UPDATED", "Descripción actualizada");
        Role existingRole = new Role(roleId, "ADMIN_OLD", "Descripción vieja"); // Simula rol de la DB
        Role roleToBeSaved = new Role(roleId, "ADMIN_UPDATED", "Descripción actualizada"); // Rol después de aplicar cambios

        // Mockear findById para devolver el rol existente
        when(roleRepository.findById(roleId)).thenReturn(Optional.of(existingRole));
        // Mockear save para devolver el rol "guardado" (con los datos actualizados)
        when(roleRepository.save(any(Role.class))).thenReturn(roleToBeSaved);

        // Act
        RoleDto resultDto = roleService.update(roleId, updatedDto);

        // Assert
        assertNotNull(resultDto);
        assertEquals(roleId, resultDto.getIdentificador());
        assertEquals("ADMIN_UPDATED", resultDto.getNombre());
        assertEquals("Descripción actualizada", resultDto.getDescripcion());

        // Verifica las interacciones
        verify(roleRepository, times(1)).findById(roleId);
        verify(roleRepository, times(1)).save(roleToBeSaved);
        
        
    }
	
	@Test
    @DisplayName("deleteByID: Debe eliminar el rol si el ID existe")
    void testDeleteByIdFound() {
        // Arrange
        Long roleId = 1L;
        Role existingRole = new Role(roleId, "ADMIN", "A eliminar");

        // Mockear findById para devolver el rol existente
        when(roleRepository.findById(roleId)).thenReturn(Optional.of(existingRole));
      
        // Act
        roleService.deleteByID(roleId);

        // Assert (Verificar interacciones)
        verify(roleRepository, times(1)).findById(roleId);
        verify(roleRepository, times(1)).delete(existingRole);
    }
	

}
