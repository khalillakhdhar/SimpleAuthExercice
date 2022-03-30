package com.th.simpleControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.th.entities.Client;
import com.th.repositories.ClientRepository;

@Controller
@RequestMapping("client")
public class ClientSimpleController {
@Autowired
ClientRepository clientRepository;
	
@GetMapping
public String getClient(Model model)
{
	Client client=new Client();
	model.addAttribute("client", client);
return "client";	


}

@PostMapping("/add")
public String addClient(@ModelAttribute(name = "client") Client client)
{
	clientRepository.save(client);
return "redirect:/client";	
}
}
