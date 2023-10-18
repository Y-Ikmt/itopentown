package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="minminresult")
public class MinminResult {

	public MinminResult() {}
	
	public MinminResult(String playerName, int score) {
		this.playername = playerName;
		this.score = score;
	}
	
	//id
	@Id
	@Column(name="id")
	private int id;
	
	//プレイヤー名
	@Column(name="playername")
	private String playername;
	
	//走れみんみんぜみのスコア
	@Column(name="score")
	private int score;
}
