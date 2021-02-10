package com.royaleGoldenFamily.checkpoint4wcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.royaleGoldenFamily.checkpoint4wcs.dto.PersonnageDto;
import com.royaleGoldenFamily.checkpoint4wcs.entities.Personnage;
import com.royaleGoldenFamily.checkpoint4wcs.repositories.PersonnageRepository;
import com.royaleGoldenFamily.checkpoint4wcs.services.PersonnagesService;


@CrossOrigin( origins = "http://localhost:4200", maxAge = 3600 )
@RestController
public class PersonnageController {
	
	@Autowired
	PersonnagesService personnageService;
	
	@Autowired
	PersonnageRepository personnageRepository;
	
	@GetMapping("/personnage")
	public List<Personnage> indexPersonnage() {
		return personnageService.getAllPersonnage();
	}
	
	@GetMapping("/personnage/{id}")
	public ResponseEntity<Personnage> showDetails(@PathVariable Long id) {
		Personnage personnage = personnageService.getPersonnageById(id);
		return ResponseEntity.ok().body(personnage);
	}
	
	@PutMapping("/personnage/{id}")
	public ResponseEntity<Personnage> updatePersonnage(@RequestBody Personnage personnage){
		Personnage personnageToUpdate = personnageService.updatePersonnage(personnage);
		return ResponseEntity.ok().body(personnageToUpdate);
	}
	
	@PostMapping("/personnage")
    public Personnage createPersonnage(@RequestBody Personnage personnage) {
        return  personnageRepository.save(personnage);
    }
	
	
	@DeleteMapping("/personnage/{id}")
	public boolean delete(@PathVariable Long id) {
		return personnageService.deletePersonnage(id);
	}
	
	

}
