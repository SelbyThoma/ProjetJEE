package com.projetjee.gestionhotel.service;

import com.projetjee.gestionhotel.modele.Chambre;
import com.projetjee.gestionhotel.repository.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ChambreImpl implements ChambreService{
    @Autowired
    ChambreRepository chambreRepository;
    @Override
    public List<Chambre> getAllChambre(){return chambreRepository.findAll();}


}
