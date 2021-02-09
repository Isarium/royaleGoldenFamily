package com.royaleGoldenFamily.checkpoint4wcs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.royaleGoldenFamily.checkpoint4wcs.entities.Personnage;

@Repository
public interface PersonnageRepository extends JpaRepository<Personnage, Long> {

}
