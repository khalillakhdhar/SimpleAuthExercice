package com.th;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.th.entities.Produit;
import com.th.repositories.ProduitRepository;

@SpringBootApplication
public class SimpleAuthExerciceApplication implements CommandLineRunner {

	@Autowired
	ProduitRepository produitRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SimpleAuthExerciceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Produit p1=new Produit("PC","toshiba satelite","pc laptop toshiba satellite core i7 pro gamer");
		produitRepository.save(p1);
		
	}

}
