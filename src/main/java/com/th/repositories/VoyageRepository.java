package com.th.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.th.entities.Voyage;

public interface VoyageRepository extends JpaRepository<Voyage, Long> {

}
