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

import com.th.entities.Voyage;
import com.th.repositories.VoyageRepository;

@RestController
@RequestMapping("/api/voyage")
public class VoyageController {
@Autowired
VoyageRepository voyageRepository;

@GetMapping
public List<Voyage> findallVoyages()
{
return voyageRepository.findAll();	
}
@PostMapping
public Voyage addOneVoyage(@RequestBody @Valid Voyage voyage )
{
return voyageRepository.save(voyage);
}
@DeleteMapping("/{id}")
public void deleteVoyage(@PathVariable long id)
{
voyageRepository.deleteById(id);	

}




}
