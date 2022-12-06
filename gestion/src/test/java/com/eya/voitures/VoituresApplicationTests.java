package com.eya.voitures;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.eya.Voitures.entities.Categorie;
import com.eya.Voitures.entities.Voiture;
import com.eya.Voitures.repos.voitureRepository;
import com.eya.Voitures.service.VoitureService;

@SpringBootTest
class VoituresApplicationTests {
	@Autowired
	private voitureRepository voitureRepository;
	@Autowired
	private VoitureService voitureService;
	@Test
	public void testCreateVoiture() {
	Voiture prod = new Voiture("Mercedess",2200.500,new Date());
	voitureRepository.save(prod);
	}
	@Test
	public void testCreateVoiture1() {
	Voiture prod1 = new Voiture("clio",1200.500,new Date());
	voitureRepository.save(prod1);
	}
	@Test
	public void testDeleteVoiture()
	{
	voitureRepository.deleteById(1L);
	}
	/*
	@Test
	public void testFindVoiture()
	{
	Voiture p = voitureRepository.findById(4L).get();

	System.out.println(p);
	}
	@Test
	public void testUpdateVoiture()
	{
	Voiture prod = voitureRepository.findById(3L).get();
	prod.setPrixVoiture(1000.0);
	voitureRepository.save(prod);
	}
	@Test
	public void testListerTousVoitures()
	{
	List<Voiture> prods = voitureRepository.findAll();
	for (Voiture p : prods)
	{
	System.out.println(p);
	}

	}
	
	@Test
	public void testFindByNomVoiture()
	{
	List<Voiture> prods = voitureRepository.findByNomVoiture("PC Dell");

	for (Voiture p : prods)
	{
	System.out.println(p);
	}

	}
	@Test
	public void testFindByNomVoitureContains()
	{
	List<Voiture> prods = voitureRepository.findByNomVoitureContains("p");

	for (Voiture p : prods)
	{
	System.out.println(p);
	}
	}
	*/
	@Test
	public void testfindByNomPrix()
	{
	List<Voiture> prods = voitureRepository.findByNomPrix("clio", 2200.5);
	for (Voiture p : prods)
	{
	System.out.println(p);
	}

	}
	@Test
	public void testfindByCategorie()
	{
	Categorie cat = new Categorie();
	cat.setIdCat(1L);

	List<Voiture> prods = voitureRepository.findByCategorie(cat);
	for (Voiture p : prods)
	{
	System.out.println(p);
	}

	}
	
	@Test
	public void findByCategorieIdCat()
	{
	List<Voiture> prods = voitureRepository.findByCategorieIdCat(1L);
	for (Voiture p : prods)
	{
	System.out.println(p);
	}

	}
	@Test
	public void testfindByOrderByNomVoitureAsc()
	{
	List<Voiture> prods = voitureRepository.findByOrderByNomVoitureAsc();
	for (Voiture p : prods)
	{  
	System.out.println(p);
	}

	}
	
	@Test
	public void testTrierVoituresNomsPrix()
	{
	List<Voiture> prods = voitureRepository.trierVoituresNomsPrix();
	for (Voiture p : prods)
	{
	System.out.println(p);
	}

	}
	
	
	
	
	
	
}
	
	
	
	
	
	


