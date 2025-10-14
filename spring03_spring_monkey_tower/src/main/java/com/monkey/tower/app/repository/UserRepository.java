package com.monkey.tower.app.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.monkey.tower.app.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	Iterable<User> findAllByFirstName(String firstName);
	//Iterable<User> findAllByActive(boolean state);
	Iterable<User> findAllByActiveTrue();
	Iterable<User> findAllByActiveFalse();
	Page<User> findAllByActiveTrue(Pageable pageable);
	
	/**
	 * Optional<T> es una clase de Java 8 (paquete java.util) 
	 * que ayuda a manejar valores nulos de forma segura 
	 * y evita errores de NullPointerException 
	 */
	Optional<User> findByEmail(String email);

}
