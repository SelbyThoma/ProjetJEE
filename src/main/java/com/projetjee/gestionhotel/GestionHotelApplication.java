package com.projetjee.gestionhotel;

import com.projetjee.gestionhotel.modele.Chambre;
import com.projetjee.gestionhotel.repository.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionHotelApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GestionHotelApplication.class, args);
	}
	@Autowired
	public ChambreRepository chambreRepository;
	@Override
	public void run(String... args) throws Exception {
		chambreRepository.save(new Chambre(null,"f1","km","dd","dk",500));

	}
}
