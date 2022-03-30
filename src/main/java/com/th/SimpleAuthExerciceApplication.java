package com.th;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.th.entities.Produit;
import com.th.entities.Role;
import com.th.entities.User;
import com.th.repositories.ProduitRepository;
import com.th.service.AccountServiceImplement;

@SpringBootApplication
public class SimpleAuthExerciceApplication implements CommandLineRunner {

	@Autowired
	ProduitRepository produitRepository;
	@Autowired
	AccountServiceImplement accountServiceImplement;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SimpleAuthExerciceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Produit p1=new Produit("PC","toshiba satelite","pc laptop toshiba satellite core i7 pro gamer");
		produitRepository.save(p1);
		accountServiceImplement.saveUser(new User("admin", "monadmin",1, null));
		accountServiceImplement.saveRole(new Role("administrateur"));
		accountServiceImplement.addRoleToUser("admin", "administrateur");
		accountServiceImplement.saveUser(new User("user", "monuser",1, null));
		accountServiceImplement.saveRole(new Role("utilisateur"));
		accountServiceImplement.addRoleToUser("user", "utilisateur");
		
		
		
		
	}

}
