package com.monkey.tower.app.service.impl;

import org.springframework.stereotype.Service;

import com.monkey.tower.app.model.User;
import com.monkey.tower.app.repository.UserRepository;
import com.monkey.tower.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
		
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User save(User user) {
		// TODO verificar si el usuario existe
		// Si existe lanzar una excepcion
		return userRepository.save(user);
	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return null;
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
