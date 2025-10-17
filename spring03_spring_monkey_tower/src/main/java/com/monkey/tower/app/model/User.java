package com.monkey.tower.app.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "first_name", length = 50, nullable = false)
	private String firstName;
	@Column(name = "last_name", length = 50, nullable = false)
	private String lastName;
	@Column(name = "email", length = 100, nullable = false, unique = true)
	private String email;
	@Column(name = "password", length = 255, nullable = false)
	private String password;
	@Column(name = "phone_number", length = 20, nullable = true)
	private String phoneNumber;
	@Column(name = "birth_date", nullable = true)
	private LocalDate birthDate;
	@Column(name = "avatar_url", length = 255, nullable = true)
	private String avatarUrl;
	@Column(name = "is_active", nullable = false)
	private boolean active = true;
	// Hibernate asignará la fecha y hora de creación automáticamente
	// updatable/insertable : el campo no debe ser modificado manualmente
	//                    desde el código, dejando que Hibernate la gestione.
	@CreationTimestamp
	@Column(name = "created_at", nullable = false, updatable = false)
	private LocalDateTime createdAt;
	// Hibernate asignará la fecha y hora de actualización automáticamente
	@UpdateTimestamp
	@Column(name = "updated_at", nullable = false)
	private LocalDateTime updatedAt;
	

	/**
     * Define una relación muchos a muchos entre la entidad 
     * User y la entidad Role.
     * Un usuario puede tener múltiples roles y un rol puede 
     * pertenecer a múltiples usuarios.
     * 
     * La relación se gestiona mediante una tabla intermedia 
     * llamada "user_has_role".
     * - La columna "user_id" en la tabla intermedia 
     *   referencia a la entidad User.
     * - La columna "role_id" en la tabla intermedia 
     *   referencia a la entidad Role.
     *   
     *   FetchType.EAGER (Ansiosa)
     *    Se carga inmediatamente, junto con la entidad principal.
     *   FetchType.LAZY (Perezosa)
     *    Se carga solo cuando se accede a la relación por primera vez.
     *    Carga los roles SÓLO si se llama a user.getRoles()
     *    
     * @ManyToMany: Define una relación de muchos a muchos. Un usuario puede tener muchos roles y viceversa.
     * fetch = FetchType.LAZY: Los roles no se cargarán hasta que se accedan explícitamente.
     * @JoinTable: Define la tabla intermedia que une 'users' y 'roles'.
     * - name = "users_has_roles": El nombre de la tabla de unión.
     * - joinColumns: La clave foránea que referencia a la entidad actual (User).
     * - inverseJoinColumns: La clave foránea que referencia a la otra entidad (Role).
     */
	@ManyToMany()
	@JoinTable(
			name="user_has_roles",
			joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id")
			)
	Set<Role> roles = new HashSet<>();
	
	// @ManyToOne
	// Role role;

	public User() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", birthDate=");
		builder.append(birthDate);
		builder.append(", avatarUrl=");
		builder.append(avatarUrl);
		builder.append(", active=");
		builder.append(active);
		builder.append(", createdAt=");
		builder.append(createdAt);
		builder.append(", updatedAt=");
		builder.append(updatedAt);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}


/*
 * GenerationType.AUTO: Esta estrategia le permite al proveedor de JPA elegir
 * automáticamente la estrategia de generación más adecuada según la base de
 * datos y la configuración. El comportamiento exacto puede variar dependiendo
 * del proveedor utilizado.
 * 
 * GenerationType.IDENTITY: Esta estrategia utiliza una columna de identidad de
 * la base de datos para generar automáticamente los valores de la clave
 * primaria. Es compatible con bases de datos como MySQL que admiten columnas de
 * autoincremento. En este caso, la base de datos se encarga de generar y
 * asignar el valor de la clave primaria.
 * 
 * GenerationType.SEQUENCE: Esta estrategia utiliza una secuencia de la base de
 * datos para generar automáticamente los valores de la clave primaria. Se
 * requiere que la base de datos admita secuencias. El proveedor de JPA utiliza
 * la secuencia definida en la base de datos para obtener los valores de la
 * clave primaria.
 * 
 * GenerationType.TABLE: Esta estrategia utiliza una tabla especial en la base
 * de datos para generar los valores de la clave primaria. Se crea una tabla
 * separada que registra los valores generados para cada entidad. El proveedor
 * de JPA consulta esta tabla para obtener el próximo valor de la clave
 * primaria.
 * 
 * GenerationType.UUID: Esta estrategia genera un UUID versión 4. Se basa 
 * en números aleatorios y no en atributos del sistema (como timestamps).
 * 
 */