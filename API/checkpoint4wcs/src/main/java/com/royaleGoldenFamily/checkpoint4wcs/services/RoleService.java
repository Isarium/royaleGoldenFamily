package com.royaleGoldenFamily.checkpoint4wcs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.royaleGoldenFamily.checkpoint4wcs.entities.Role;
import com.royaleGoldenFamily.checkpoint4wcs.repositories.RoleRepository;

@Service
public class RoleService {
	
	@Autowired
	RoleRepository roleRepository;
	
	public List<Role> getAllRole() {
		return roleRepository.findAll();		
	}
	
	public Role getRoleById(Long id) {
		return roleRepository.findById(id).get();
	}
	
	public Role updateRole(@RequestBody Role role) {
		return roleRepository.save(role);
	}
	
	public boolean deleteRole(Long id) {
		roleRepository.deleteById(id);
		return true;
	}
	
	

}
