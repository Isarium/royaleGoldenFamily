package com.royaleGoldenFamily.checkpoint4wcs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.royaleGoldenFamily.checkpoint4wcs.entities.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
