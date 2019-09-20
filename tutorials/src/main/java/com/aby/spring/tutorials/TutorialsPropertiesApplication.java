package com.aby.spring.tutorials;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.aby.spring.tutorials.properties.ExternalService;

@Configuration // This annotation is used while using spring core and not spring boot
@ComponentScan
@PropertySource("classpath:app.properties")
public class TutorialsPropertiesApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applContext = new AnnotationConfigApplicationContext(
				TutorialsPropertiesApplication.class)) {
			ExternalService service = applContext.getBean(ExternalService.class);
			System.out.println("returnURL:::" + service.returnURL());

		}
	}

}
