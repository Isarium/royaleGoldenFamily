package com.royaleGoldenFamily.checkpoint4wcs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import com.royaleGoldenFamily.checkpoint4wcs.dto.PersonnageDto;
import com.royaleGoldenFamily.checkpoint4wcs.entities.Personnage;
import com.royaleGoldenFamily.checkpoint4wcs.repositories.PersonnageRepository;


@Service
public class PersonnagesService {
	
	@Autowired
	PersonnageRepository personnageRepository;
	
	public List<Personnage> getAllPersonnage() {
		return personnageRepository.findAll();
	}
	
	public Personnage getPersonnageById(Long id) {
		return personnageRepository.findById(id).get();
	}
	
	public Personnage updatePersonnage(@RequestBody Personnage personnage) {
		return personnageRepository.save(personnage);
	}
	
	public Personnage createPersonnage(PersonnageDto dto) {
        return personnageRepository.save(createPersonnage(dto));
    }
	
	public boolean deletePersonnage(Long id) {
		 personnageRepository.deleteById(id);
		 return true;
	}
	
	
}
