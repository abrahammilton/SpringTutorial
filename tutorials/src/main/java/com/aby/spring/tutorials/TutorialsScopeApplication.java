package com.aby.spring.tutorials;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.aby.spring.tutorials.scope.PersonDAO;

//@SpringBootApplication -> Spring boot impl
@Configuration
public class TutorialsScopeApplication {

	static Logger log = LoggerFactory.getLogger(TutorialsScopeApplication.class);

	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applContext = 
				new AnnotationConfigApplicationContext(TutorialsScopeApplication.class)){
			
			// ApplicationContext applContext =
			// SpringApplication.run(TutorialsScopeApplication.class, args); -> Spring boot impl
			//ApplicationContext applContext = 
			//		new AnnotationConfigApplicationContext(TutorialsScopeApplication.class);// -> Spring core impl
			PersonDAO person1 = applContext.getBean(PersonDAO.class);
			PersonDAO person2 = applContext.getBean(PersonDAO.class);
			
			log.info("{}", person1);
			log.info("{}", person1.getConnection());
			log.info("{}", person2);
			log.info("{}", person2.getConnection());
		}
	}

}
