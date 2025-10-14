package com.monkey.tower.app.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
	
	@Id
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

}
