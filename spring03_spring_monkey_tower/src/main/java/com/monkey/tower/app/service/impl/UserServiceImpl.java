package com.monkey.tower.app.service.impl;

import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.monkey.tower.app.model.User;
import com.monkey.tower.app.repository.UserRepository;
import com.monkey.tower.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
		
	public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public User save(User user) {
		// TODO verificar si el usuario existe
		// Si existe lanzar una excepcion
		user.setPassword(passwordEncoder.encode( user.getPassword()) );
		System.out.println(user);
		return userRepository.save(user);
	}

	@Override
	public User findById(Long id) {
		Optional<User> optionalUser = userRepository.findById(id);
		if( optionalUser.isEmpty()) {
			throw new IllegalStateException("User doesnot exist with id " + id);			
		}
		User existingUser = optionalUser.get();
		return existingUser;
	}

	@Override
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(Long id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByID(Long id) {
		// TODO Auto-generated method stub
		
	}

}
