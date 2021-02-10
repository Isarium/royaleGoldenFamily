package com.royaleGoldenFamily.checkpoint4wcs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.royaleGoldenFamily.checkpoint4wcs.entities.Contact;
import com.royaleGoldenFamily.checkpoint4wcs.repositories.ContactRepository;

@Service
public class ContactService {

	@Autowired
	ContactRepository contactRepository;
	
	public List<Contact> getAllContact() {
		return contactRepository.findAll();
	}
	
	public Contact getContactById(Long id) {
		return contactRepository.findById(id).get();
	}
	
	public boolean deleteContact(Long id ) {
		contactRepository.deleteById(id);
		return true;
	}
}
