package com.eya.Voitures.service;

import java.util.List;

import com.eya.Voitures.entities.Categorie;
import com.eya.Voitures.entities.Voiture;
import com.eya.Voitures.repos.voitureRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
public class VoitureserviceImpl implements VoitureService {
@Autowired
voitureRepository VoitureRepository;
@Override
public Voiture saveVoiture(Voiture p) {
	return VoitureRepository.save(p);
	}
	@Override
	public Voiture updateVoiture(Voiture p) {
	return VoitureRepository.save(p);
	}
	@Override
	public void deleteVoiture(Voiture p) {
	VoitureRepository.delete(p);
	}
	 @Override
	public void deleteVoitureById(Long id) {
	VoitureRepository.deleteById(id);
	}
	@Override
	public Voiture getVoiture(Long id) {
	return VoitureRepository.findById(id).get();
	}
	@Override
	public List<Voiture> getAllVoitures() {
	return VoitureRepository.findAll();
	}
	

		@Override
		public  Page<Voiture>  getAllVoituresParPage(int  page,  int  size)  {

		return  VoitureRepository.findAll(PageRequest.of(page,  size));
		}
		
		@Override
		public List<Voiture> findByNomVoiture(String nom) {
		return VoitureRepository.findByNomVoiture(nom);
		}
		@Override
		public List<Voiture> findByNomVoitureContains(String nom) {
		return VoitureRepository.findByNomVoitureContains(nom);
		}
		@Override
		public List<Voiture> findByNomPrix(String nom, Double prix) {


		return VoitureRepository.findByNomPrix(nom, prix);
		}
		@Override
		public List<Voiture> findByCategorie(Categorie categorie) {
		return VoitureRepository.findByCategorie(categorie);
		}
		@Override
		public List<Voiture> findByCategorieIdCat(Long id) {
		return VoitureRepository.findByCategorieIdCat(id);
		}
		@Override
		public List<Voiture> findByOrderByNomVoitureAsc() {
		return VoitureRepository.findByOrderByNomVoitureAsc();
		}
		@Override
		public List<Voiture> trierVoituresNomsPrix() {
		return VoitureRepository.trierVoituresNomsPrix();
		}
		
		

		
	
	}
