package com.monkey.tower.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monkey.tower.app.model.User;
import com.monkey.tower.app.service.UserService;


@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin(origins = "*")
public class UserController {
	
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping
	ResponseEntity<User> createdUser(@RequestBody User user){
		User createdUser = userService.save(user);
		return ResponseEntity.status(201).body(createdUser);
	}
	
	@GetMapping("/{id}")
	ResponseEntity<User> findById(@PathVariable("id") Long id){
		User existingUser = userService.findById(id);
		return ResponseEntity.ok(existingUser);
	}
	
	

}
