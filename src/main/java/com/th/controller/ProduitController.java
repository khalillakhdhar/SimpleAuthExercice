package com.th.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.th.entities.Produit;
import com.th.repositories.ProduitRepository;

@RestController
@RequestMapping("produit")
public class ProduitController {
	@Autowired
	ProduitRepository produitRepository;
	
	public List<Produit> getAll()
	{
		return produitRepository.findAll();
		
	}
	

	
	
	
}
