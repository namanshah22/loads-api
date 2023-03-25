package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.payLoad;

public interface loadDao extends JpaRepository<payLoad, Long>{
	
}