package com.royaleGoldenFamily.checkpoint4wcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.royaleGoldenFamily.checkpoint4wcs.entities.Contact;
import com.royaleGoldenFamily.checkpoint4wcs.services.ContactService;

@CrossOrigin( origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class ContactController {
	
	@Autowired
	ContactService contactService;
	
	@GetMapping("/contact")
	public List<Contact> indexContact() {
		return contactService.getAllContact();
	}
	
	@GetMapping("/contact/{id}")
	public ResponseEntity<Contact> showDetail(@PathVariable Long id) {
		Contact contact = contactService.getContactById(id);
		return ResponseEntity.ok().body(contact);
	}
	
	@DeleteMapping("/contact/{id}")
	public boolean delete(@PathVariable Long id) {
		return contactService.deleteContact(id);
		
	}
	
	

}
