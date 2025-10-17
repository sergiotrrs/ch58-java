package com.monkey.tower.app.service;

import com.monkey.tower.app.model.User;

public interface UserService {

	User save(User user);
	
	User findById(Long id);
	
	Iterable<User> findAll();
	
	User update(Long id, User user);
	
	void deleteByID(Long id);
	
}
