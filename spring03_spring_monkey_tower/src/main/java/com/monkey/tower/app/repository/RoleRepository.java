package com.monkey.tower.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.monkey.tower.app.model.Role;

/**
 * La especificación de JPA (Java Persistence API) es una especificación estándar 
 * de Java que define una interfaz común y un conjunto de reglas para el 
 * mapeo objeto-relacional(ORM) y la gestión de entidades en aplicaciones Java.
 * 
 * JPA permite a los desarrolladores trabajar con bases de datos utilizando 
 * objetos Java, eliminando la necesidad de escribir consultas SQL 
 * directamente y proporcionando un enfoque orientado a objetos 
 * para la persistencia de datos. JPA define un conjunto de reglas 
 * y contratos para trabajar con bases de datos, pero no proporciona 
 * una implementación concreta.
 * 
 * Varios proveedores de tecnología, como Hibernate, EclipseLink, Apache
 * OpenJPA, entre otros, implementan la especificación de JPA y proporcionan las
 * bibliotecas y herramientas necesarias para utilizar JPA en aplicaciones Java.
 * Estas implementaciones ofrecen funcionalidades adicionales y características
 * específicas, además de cumplir con los requisitos básicos definidos por la
 * especificación de JPA.
 * 
 * Por defecto, Spring Boot utiliza Hibernate como proveedor de JPA.
 * 
 * Puedes especificar el proveedor de JPA a través de la propiedad
 * spring.jpa.properties.hibernate.dialect, donde hibernate.dialect es la
 * propiedad específica de Hibernate
 * 
 * Hibernate es un framework de mapeo objeto-relacional que simplifica el acceso
 * a bases de datos relacionales y permite a los desarrolladores trabajar con
 * objetos en lugar de consultas SQL. Hibernate proporciona un lenguaje de
 * consulta llamado Hibernate Query Language (HQL), similar a SQL pero orientado
 * a objetos.
 * 
 * CrudRepository es una interfaz básica que proporciona métodos CRUD estándar.
 * Si necesitas características adicionales como consultas paginación, 
 * es recomendable utilizar la interfaz PagingAndSortingRepository. 
 * 
 * ¿Cuál usar? 
 * - CrudRepository: Si solo necesitas operaciones CRUD básicas 
 *   sin requerir paginación ni ordenación.
 * - PagingAndSortingRepository: Si necesitas paginación y ordenación 
 *   de los resultados sin necesidad de funcionalidades avanzadas de JPA.
 * - JpaRepository: Necesitas funcionalidades avanzadas como la gestión 
 *   de transacciones, flush o la eliminación de entidades en lotes.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
	
	/*
	 * Los query methods se refieren a métodos definidos en las 
	 * interfaces de repositorios en Spring Data JPA (y otras 
	 * implementaciones de Spring Data) que permiten generar 
	 * consultas de manera automática a partir del nombre del 
	 * método. Estos métodos siguen una convención de nombres 
	 * específica que indica la consulta que deben ejecutar, 
	 * evitando la necesidad de escribir manualmente consultas 
	 * JPQL (Java Persistence Query Language) o SQL.
	 * 
	 * https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
	 * 
	 */
	/*
	 * Crear una búsqueda todos los roles que cumplan con una palabra
	 * en la descripción.
	 * SELECT * FROM roles WHERE description LIKE(%?%)
	 */
	Iterable<Role> findAllByDescriptionContaining(String description);

}
