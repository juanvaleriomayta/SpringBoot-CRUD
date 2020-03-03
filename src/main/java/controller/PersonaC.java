package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import interfaceServices.PersonaSI;
import modelo.PersonaM;

@Controller
@RequestMapping
public class PersonaC {

	@Autowired
	private PersonaSI service;

	@GetMapping("/listarPersona")
	public String listar(Model model) throws Exception {
		List<PersonaM> personas = service.listarPersona();
		model.addAttribute("personas", personas);
		return "index";
	}
}
