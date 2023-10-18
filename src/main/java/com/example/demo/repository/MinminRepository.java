package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.MinminResult;

public interface MinminRepository extends JpaRepository<MinminResult,Integer>{
	List<MinminResult> findTop3ByOrderByScoreDesc();
}
