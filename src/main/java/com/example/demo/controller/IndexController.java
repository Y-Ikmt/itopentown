package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.form.LoginForm;
import com.example.demo.form.RegistForm;

@Controller
public class IndexController {

	@GetMapping("/")
	public String showIndex(Model model) {
		LoginForm loginForm = new LoginForm();
		RegistForm registForm = new RegistForm();
		model.addAttribute("loginForm", loginForm);
		model.addAttribute("registForm", registForm);
		return "index";
	}
	

}
