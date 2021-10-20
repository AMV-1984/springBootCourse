package com.domain.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/home")
	public String goIndex() {
		return "index";
	}
	
	@RequestMapping("/")
	public String getPresentacion() {
		return "presentacion";
	}
	
	@RequestMapping("/listado")
	public String getlistado(Model model ) {
		List<String> alumnos = new ArrayList<String>();
		
		alumnos.add("Pepito");
		alumnos.add("Jaimito");
		alumnos.add("Jorgito");
		
		model.addAttribute("titulo", "Listado de Alumnos");
		model.addAttribute("profesor", "Grabriel Casas");
		model.addAttribute("alumnos", alumnos);
		
		return "listado";
	}


}
