package com.monkey.tower.app.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

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
@Table(name="roles")
public class Role {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre_role", length=50, nullable=false)
	private String name;
	@Column(name="description", length=150, nullable=true)
	private String description;
	
	// Relación ManyToMany inversa con User
    // 'mappedBy' indica que la relación es propiedad de la entidad 'User'
    // a través del campo 'roles' en la clase User.
	@ManyToMany(mappedBy = "roles")
	private Set<User> users = new HashSet<>();
	
	public Role() {}
	
	public Role(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public Role(String name, String description) {
		this(null, name, description);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Role [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		return Objects.equals(description, other.description) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}
	
	
}
