package com.th.simpleControllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.th.entities.Voyage;
import com.th.repositories.VoyageRepository;

@Controller
@RequestMapping("voyage")
public class VoyageSimpleController {
@Autowired
VoyageRepository voyageRepository;
@GetMapping
public String getVoyage(Model model)
{
	
	Voyage voyage=new Voyage();
	model.addAttribute("voyage", voyage);
	
	return "voyage";

}
@PostMapping("add")
public String addVoyage(@Valid Voyage voyage, BindingResult result)
{
	
	if(result.hasErrors())
		return "voyage";
	else
	{
voyageRepository.save(voyage);
return "redirect:/voyage";
	}

}
@GetMapping("liste")
public String getListe(Model model)
{
	List<Voyage> lv=voyageRepository.findAll();
	model.addAttribute("voyages", lv);	
return "listVoyage";
}




}
