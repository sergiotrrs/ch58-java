package com.monkey.tower.app.util;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.monkey.tower.app.model.Role;
import com.monkey.tower.app.model.User;
import com.monkey.tower.app.repository.UserRepository;

@Component
@Order(3)
@Profile("devH2")
public class UserDataLoader implements CommandLineRunner {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
		
	public UserDataLoader(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		User bob = new User();
		bob.setFirstName("Bob");
		bob.setLastName("Esponja");
		bob.setEmail("bob@nickelodeon.com");
		bob.setPassword(passwordEncoder.encode("recetasecreta"));
				
		Set<Role> roles = new HashSet<>();
		roles.add(new Role(4L, null, null)); // CUSTOMER en la clase RoleDataLoader
		roles.add(new Role(1L, null, null)); // ADMIN
		bob.setRoles(roles);
		
		userRepository.save(bob);

	}

}