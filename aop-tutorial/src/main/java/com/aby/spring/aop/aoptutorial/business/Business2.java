package com.aby.spring.aop.aoptutorial.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aby.spring.aop.aoptutorial.data.Dao2;

@Service
public class Business2 {

	@Autowired
	private Dao2 dao;
	
	public String calculate() {
		return dao.retrieveSomething();
	}
}
