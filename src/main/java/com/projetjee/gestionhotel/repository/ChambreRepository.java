package com.projetjee.gestionhotel.repository;

import com.projetjee.gestionhotel.modele.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
