package com.th.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.th.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
