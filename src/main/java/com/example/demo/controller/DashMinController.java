package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.MinminResult;
import com.example.demo.service.DashMinminService;

@Controller
public class DashMinController {

	@Autowired
	DashMinminService minminService;
	
	@GetMapping("/minmin")
	public String showDashMin(Model model) {
	
		List<MinminResult> rankingList = minminService.getRanking();
		model.addAttribute("rankingList", rankingList);
		
		return "dashMin";
	}
	

}
