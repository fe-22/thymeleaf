package com.fthec.form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fthec.formview.User;



@Controller
@RequestMapping("/users")
public class UserController {
	
	//*A conexão entre a classe de modelo e o formulário começa no controller, com as linhas do*//
	@GetMapping
	public String usersForm(final Model model) {
		
		model.addAttribute("user", new User());
		
		return "userForm";
		
	}
	
	@PostMapping
	public String result(@ModelAttribute User user) {
	 
	    return "result";
	}
}
	
	
	


