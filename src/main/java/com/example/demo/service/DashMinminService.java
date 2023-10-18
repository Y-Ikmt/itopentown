package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MinminResult;
import com.example.demo.repository.MinminRepository;

@Service
public class DashMinminService {
	
	@Autowired
	MinminRepository minminRepo;

	/**
	 * 走れみんみんぜみのリザルトを登録する
	 * @param playerName
	 * @param score
	 * @return
	 */
	public boolean registResult(String playerName, int score) {
		
		boolean result = false;
		MinminResult model = new MinminResult(playerName,score);
		
		minminRepo.save(model);
		result = true;
		
		return result;
	}
	
	public List<MinminResult> getRanking(){
		return minminRepo.findTop3ByOrderByScoreDesc();
	}
	
}
