package com.aby.spring.tutorials;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.aby.spring.componentscan.ComponentPersonDAO;

@SpringBootApplication // scans components in same package and sub-packages
@ComponentScan("com.aby.spring.componentscan") //scan components in specified package and sub-packages
public class TutorialsComponentScanApplication {

	static Logger log = LoggerFactory.getLogger(TutorialsComponentScanApplication.class);
	
	public static void main(String[] args) {

		ApplicationContext applContext = SpringApplication.run(TutorialsComponentScanApplication.class, args);
		ComponentPersonDAO compDAO = applContext.getBean(ComponentPersonDAO.class);
		
		log.info("{}", compDAO);
		log.info("{}", compDAO.getConnection());
	}

}
