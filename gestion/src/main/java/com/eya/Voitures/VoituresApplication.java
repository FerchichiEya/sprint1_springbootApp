package com.eya.Voitures;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.eya.Voitures.entities.Categorie;
import com.eya.Voitures.entities.Voiture;
import com.eya.Voitures.service.VoitureService;
import com.eya.Voitures.repos.*;

@SpringBootApplication
public class VoituresApplication implements CommandLineRunner {
	@Autowired
	RepositoryRestConfiguration  repositoryRestConfiguration;

	public  static  void  main(String[]  args)  { 
		SpringApplication.run(VoituresApplication.class,  args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repositoryRestConfiguration.exposeIdsFor(Voiture.class,Categorie.class);
		
	}
	



	

}
