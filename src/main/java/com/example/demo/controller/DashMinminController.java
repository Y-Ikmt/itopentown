package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DashMinminService;

@RestController
@RequestMapping("*")
public class DashMinminController {

	@Autowired
	DashMinminService minSer;
		
	@PostMapping("/minmin-result")
	public String registResult(@RequestParam("score") int score, @RequestParam("playerName") String playerName){
		Integer i = Integer.valueOf(score);
		if(0 == playerName.length()) {
			playerName = "No Name";
		}
		System.out.println("score:" + i.toString() + " playerName:" + playerName);
		
		//結果をDBに登録
		minSer.registResult(playerName, score);
		
		return "OK";
	}
}
