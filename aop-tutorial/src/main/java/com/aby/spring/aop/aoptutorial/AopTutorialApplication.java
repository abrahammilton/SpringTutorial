package com.aby.spring.aop.aoptutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aby.spring.aop.aoptutorial.business.Business1;
import com.aby.spring.aop.aoptutorial.business.Business2;

@SpringBootApplication
public class AopTutorialApplication implements CommandLineRunner{

	private Logger log = LoggerFactory.getLogger(AopTutorialApplication.class);
	
	@Autowired
	private Business1 bus1;
	
	@Autowired
	private Business2 bus2;
	
	public static void main(String[] args) {
		SpringApplication.run(AopTutorialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(bus1.calculate());
		log.info(bus2.calculate());
	}

}
