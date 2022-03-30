package com.th.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.th.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
