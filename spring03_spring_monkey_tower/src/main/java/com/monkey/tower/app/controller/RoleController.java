package com.monkey.tower.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monkey.tower.app.dto.RoleDto;
import com.monkey.tower.app.service.RoleService;


/**
 *  Una API REST, o Interfaz de Programación de Aplicaciones Representacional 
 *  por sus siglas en inglés (Representational State Transfer), 
 *  es un conjunto de reglas y convenciones para construir 
 *  servicios web que permiten la comunicación entre sistemas 
 *  de software a través del protocolo HTTP de manera simple y eficiente.
 *  
 *  Beneficios: Permite que sistemas desarrollados en diferentes 
 *  lenguajes de programación y ejecutados en diferentes 
 *  plataformas puedan comunicarse entre sí.
 *  
 * @RestController indica que la clase será un controlador API REST
 * Esta anotación combina @Controller y @ResponseBody
 * 
 * @Controller Indica la clase como un controlador MVC (Model-View-Controller).
 *  Esta clase se encarga de manejar las solicitudes HTTP y devuelve una respuesta
 *  
 * @ResponseBody indica que los métodos devuelven la respuesta en el cuerpo de la
 *  respuesta HTTP. Los objetos devueltos por los métodos se serializan automáticamente
 *  en el formato deseado. Por default la respuesta es en JSON.
 *  
 * @RequestMapping mapea una solicitud HTTP en la URL indicada.
 *  Se puede aplicar a nivel de clase o método.
 *  A nivel de clase define el prefijo común de la URL para todas
 *  las rutas de los métodos.
 *  
 *  @CrossOrigin(origins = "*") en Spring Boot se utiliza para 
 *  habilitar el CORS (Cross-Origin Resource Sharing), lo que 
 *  permite que tu aplicación acepte solicitudes desde cualquier 
 *  origen externo.
 *  
 */


@RestController
@RequestMapping("/api/v1/roles")
@CrossOrigin(origins = "*") // origins = {"https://myecommerce.com","http://localhost:8080"}
public class RoleController {

	private final RoleService roleService;

	public RoleController(RoleService roleService) {
		this.roleService = roleService;
	}
	
//	@GetMapping("/api/v1/roles")
//	Iterable<RoleDto> getAllRoles(){
//		return  roleService.findAll();
//	}
	@GetMapping // ("/api/v1/roles")
	ResponseEntity<Iterable<RoleDto>> getAllRoles(){
		return ResponseEntity.ok(roleService.findAll());
	}
	
	@PostMapping // ("/api/v1/roles")
	ResponseEntity<RoleDto> createdRole(@RequestBody RoleDto roleDto) {
		RoleDto createdRole = roleService.save(roleDto);  
		return ResponseEntity.status(201).body(createdRole);
	}
	
	/**
	 * La anotación @PathVariable en Spring MVC se utiliza para 
	 * extraer valores de la URL de una solicitud HTTP y vincularlos 
	 * a los parámetros de un método de controlador. Esto permite que 
	 * los parámetros dinámicos en la URL se pasen a los métodos del 
	 * controlador, facilitando la creación de rutas RESTful y 
	 * permitiendo la captura de valores específicos directamente 
	 * desde la URL.
	 * 
	 * Los valores dinámicos se definen en la URL de la solicitud 
	 * utilizando llaves {}. Estos valores pueden ser extraídos y 
	 * utilizados en los métodos del controlador.
	 */
	@GetMapping("/{id}") // http://localhost:8080/api/v1/role/ID_recurso
	ResponseEntity<RoleDto> findById(@PathVariable("id")Long id){
		RoleDto existingRoleDto = roleService.findById(id);
		return ResponseEntity.ok(existingRoleDto);
	}
	
	@PutMapping("/{id}") // http://localhost:8080/api/v1/role/ID_recurso
	ResponseEntity<RoleDto> updateById(
			@PathVariable("id")Long id,
			@RequestBody RoleDto roleDto
			){
		RoleDto existingRoleDto = roleService.update(id, roleDto);
		return ResponseEntity.ok(existingRoleDto);
	}

	@DeleteMapping("/{id}") // http://localhost:8080/api/v1/role/ID_recurso
	ResponseEntity<Void> deleteById(@PathVariable("id")Long id){
		roleService.deleteByID(id);
		return ResponseEntity.noContent().build();		
	}
	
}
