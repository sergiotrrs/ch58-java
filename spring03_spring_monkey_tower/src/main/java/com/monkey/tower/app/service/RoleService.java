package com.monkey.tower.app.service;

import com.monkey.tower.app.dto.RoleDto;
import com.monkey.tower.app.model.Role;

public interface RoleService {
	
	// ========= CRUD ============
	// Role save(Role role);
	RoleDto save(RoleDto role);
	
	RoleDto findById(Long id);
	
	Iterable<RoleDto> findAll();
	
	RoleDto update(Long id, RoleDto role);
	
	void deleteByID(Long id);
	
	// ========= Métodos adicionales ========
	Iterable<RoleDto> findAllByDescription(String description);

}
