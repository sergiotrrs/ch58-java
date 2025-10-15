package com.monkey.tower.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.monkey.tower.app.dto.RoleDto;
import com.monkey.tower.app.service.RoleService;

@RestController
public class RoleController {

	private final RoleService roleService;

	public RoleController(RoleService roleService) {
		this.roleService = roleService;
	}
	
	@GetMapping("/api/v1/roles")
	Iterable<RoleDto> getAllRoles(){
		return  roleService.findAll();
	}
	
	@PostMapping("/api/v1/roles")
	RoleDto createRole(@RequestBody RoleDto roleDto) {
		return roleService.save(roleDto);
	}
	
}
