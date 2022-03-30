package com.th.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.th.entities.Produit;
import com.th.repositories.ProduitRepository;

@RestController
@RequestMapping("api/produit")
public class ProduitController {
	@Autowired
	ProduitRepository produitRepository;
	@GetMapping
	public List<Produit> getAll()
	{
		return produitRepository.findAll();
		
	}
	@PostMapping
	public Produit addProduct(@RequestBody @Valid Produit produit)
	{
		return produitRepository.save(produit);
	}
	@GetMapping("/{id}")
	public Produit getOneProduct(@PathVariable long id)
	{
		return produitRepository.findById(id).get(); // la méthode retourne optional par defaut => get transforme le result en object
	}
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable long id)
	{
		produitRepository.deleteById(id);
		
	}
	
	
}
