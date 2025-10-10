package org.generation.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@GetMapping("/saludo")
	 String greeting(
			 Model model, 
			 @RequestParam(name="name", required=false, defaultValue="Persona invitada") String nameValue ) {
		 model.addAttribute("userName", nameValue);
		 return "greeting";
	 }
	
}
