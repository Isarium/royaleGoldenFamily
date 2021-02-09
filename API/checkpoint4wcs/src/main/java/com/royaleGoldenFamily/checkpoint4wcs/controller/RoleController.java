package com.royaleGoldenFamily.checkpoint4wcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.royaleGoldenFamily.checkpoint4wcs.entities.Role;
import com.royaleGoldenFamily.checkpoint4wcs.services.RoleService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	@GetMapping("/role")
	public List<Role> indexRole() {
		return roleService.getAllRole();
	}
	
	@GetMapping("/role/{id}")
	public ResponseEntity<Role> showDetails(@PathVariable Long id) {
		Role role = roleService.getRoleById(id);
		return ResponseEntity.ok().body(role);
	}

	@PutMapping("/role/{id}")
	public ResponseEntity<Role> updateRole(@RequestBody Role role) {
		Role roleToUpdate = roleService.updateRole(role);
		return ResponseEntity.ok().body(roleToUpdate);
	}
	
	@DeleteMapping("/role/{id}")
	public boolean delete(@PathVariable Long id) {
		return roleService.deleteRole(id);
	}
}
