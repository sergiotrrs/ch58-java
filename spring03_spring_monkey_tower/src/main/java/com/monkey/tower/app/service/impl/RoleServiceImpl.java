package com.monkey.tower.app.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.stereotype.Service;

import com.monkey.tower.app.dto.RoleDto;
import com.monkey.tower.app.model.Role;
import com.monkey.tower.app.repository.RoleRepository;
import com.monkey.tower.app.service.RoleService;


// @Component
@Service
public class RoleServiceImpl implements RoleService {

	private final RoleRepository roleRepository;
		
	public RoleServiceImpl(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	@Override
	public RoleDto save(RoleDto role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoleDto findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<RoleDto> findAll() {
		List<RoleDto> rolesDto = new ArrayList<>();
		Iterable<Role> roles = roleRepository.findAll();
		for(Role role : roles) {
			RoleDto roleDto= new RoleDto(role.getId(), role.getName(), role.getDescription());
			rolesDto.add( roleDto );
		}
		return rolesDto;
	}

	@Override
	public RoleDto update(Long id, RoleDto role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByID(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<RoleDto> findAllByDescription(String description) {
		// TODO Auto-generated method stub
		return null;
	}

}
