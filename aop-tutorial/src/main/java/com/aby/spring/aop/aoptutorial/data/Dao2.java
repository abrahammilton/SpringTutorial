package com.aby.spring.aop.aoptutorial.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {

	public String retrieveSomething() {
		return "DAO2";
	}
}
