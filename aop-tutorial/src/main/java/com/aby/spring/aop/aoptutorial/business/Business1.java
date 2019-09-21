package com.aby.spring.aop.aoptutorial.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aby.spring.aop.aoptutorial.data.Dao1;

@Service
public class Business1 {

	@Autowired
	private Dao1 dao;
	
	public String calculate() {
		return dao.retrieveSomething();
	}
}
