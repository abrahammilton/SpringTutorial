package com.aby.spring.aop.aoptutorial.data;

import org.springframework.stereotype.Repository;

import com.aby.spring.aop.aoptutorial.aspect.TrackTime;

@Repository
public class Dao1 {

	@TrackTime
	public String retrieveSomething() {
		return "DAO1";
	}
}
