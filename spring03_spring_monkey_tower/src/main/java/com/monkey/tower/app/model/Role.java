package com.monkey.tower.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 *  Las clases que se usan para mapear a tablas de una base
 *  de datos se llaman Entidades (entities).
 * 
 * Características:
 *  - Tiene atributos privados.
 *  - Usa getters y setters.
 *  - Puede tener un constructor vacío y otro con parámetros.
 *  - No contiene lógica de negocio compleja ni anotaciones 
 *  especiales.
 *  
 * @Entity se usa para marcar una clase como una entidad que se puede persistir
 *         en una base de datos relacional.
 * 
 *         Se indica a JPA que la clase representa una tabla en la base de datos
 *         y que los objetos de esta clase puedan ser almacenados, actualizados
 *         o eliminados en dicha tabla. Además, cada instancia se la clase se
 *         considera una fila en la tabla.
 *
 * @Id Toda entidad debe tener un campo qe actúe como clave primaria.
 */
@Entity
public class Role {

	@Id	
	private Long id;
	@Column(name="nombre_role", length=50, nullable=false)
	private String name;
	private String description;
}
