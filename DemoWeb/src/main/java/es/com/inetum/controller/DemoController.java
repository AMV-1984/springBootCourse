package es.com.inetum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.com.inetum.model.Persona;
import es.com.inetum.repo.IPersonaRepo;

@Controller
public class DemoController {
	
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		if(name==null|| name.isEmpty()) {
			name = "AlvaroCodigo";
		}
		Persona persona = new Persona(0, name);
		repo.save(persona);
		
		model.addAttribute("name", name);
		
		return "greeting";
	}

}
