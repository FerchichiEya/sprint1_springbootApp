package com.eya.Voitures.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.eya.Voitures.entities.Categorie;
import com.eya.Voitures.entities.Voiture;

public interface VoitureService {
	Voiture saveVoiture(Voiture p);
	Voiture updateVoiture(Voiture p);
	void deleteVoiture(Voiture p);
	 void deleteVoitureById(Long id);
	 
	Voiture getVoiture(Long id);
	List<Voiture> getAllVoitures();
	List<Voiture> findByNomVoiture(String nom);
	List<Voiture> findByNomVoitureContains(String nom);
	List<Voiture> findByNomPrix (String nom, Double prix);
	List<Voiture> findByCategorie (Categorie categorie);
	List<Voiture> findByCategorieIdCat(Long id);
	List<Voiture> findByOrderByNomVoitureAsc();
	List<Voiture> trierVoituresNomsPrix();
	
	public  Page<Voiture>  getAllVoituresParPage(int  page,  int  size);



}
