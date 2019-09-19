package com.aby.spring.tutorials;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.aby.spring.tutorials.scope.PersonDAO;

@SpringBootApplication
public class TutorialsScopeApplication {

	static Logger log = LoggerFactory.getLogger(TutorialsScopeApplication.class);
	
	public static void main(String[] args) {

		ApplicationContext applContext = SpringApplication.run(TutorialsScopeApplication.class, args);
		PersonDAO person1 = applContext.getBean(PersonDAO.class);
		PersonDAO person2 = applContext.getBean(PersonDAO.class);
		
		log.info("{}", person1);
		log.info("{}", person1.getConnection());
		log.info("{}", person2);
		log.info("{}", person2.getConnection());
	}

}
