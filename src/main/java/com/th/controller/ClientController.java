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

import com.th.entities.Client;
import com.th.repositories.ClientRepository;

@RestController
@RequestMapping("api/client")
public class ClientController {
@Autowired
ClientRepository clientRepository;
@GetMapping
public List<Client> findAllClients()
{
return clientRepository.findAll();	

}
@PostMapping
public Client addOne(@Valid @RequestBody Client client)
{
return clientRepository.save(client);	
}
@DeleteMapping("/{id}")
public void deleteUser(@PathVariable long id)
{
clientRepository.deleteById(id);	
}


}
