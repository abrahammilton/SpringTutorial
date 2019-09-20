package com.aby.spring.tutorials;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.aby.spring.componentscan.ComponentPersonDAO;

//@SpringBootApplication // scans components in same package and sub-packages
@Configuration
@ComponentScan("com.aby.spring.componentscan") // scan components in specified package and sub-packages
public class TutorialsComponentScanApplication {

	static Logger log = LoggerFactory.getLogger(TutorialsComponentScanApplication.class);

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext applContext = new AnnotationConfigApplicationContext(
				TutorialsComponentScanApplication.class)){
			
			// ApplicationContext applContext =
			// SpringApplication.run(TutorialsComponentScanApplication.class, args); -> Spring boot impl
			//ApplicationContext applContext = new AnnotationConfigApplicationContext(
			//		TutorialsComponentScanApplication.class); // -> Spring core impl
			ComponentPersonDAO compDAO = applContext.getBean(ComponentPersonDAO.class);
			
			log.info("{}", compDAO);
			log.info("{}", compDAO.getConnection());
		}

	}

}
