package com.royaleGoldenFamily.checkpoint4wcs.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private String formateur;
	private String apprentit;
	
	public Role() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFormateur() {
		return formateur;
	}

	public void setFormateur(String formateur) {
		this.formateur = formateur;
	}

	public String getApprentit() {
		return apprentit;
	}

	public void setApprentit(String apprentit) {
		this.apprentit = apprentit;
	}
	
	
}
