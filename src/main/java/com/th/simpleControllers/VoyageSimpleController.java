package com.th.simpleControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	List<Voyage> lv=voyageRepository.findAll();
	Voyage voyage=new Voyage();
	model.addAttribute("voyage", voyage);
	model.addAttribute("voyages", lv);
	return "voyage";

}
@PostMapping("add")
public String addVoyage(@ModelAttribute(name="voyage") Voyage voyage)
{
voyageRepository.save(voyage);
return "redirect:/voyage";


}

}
