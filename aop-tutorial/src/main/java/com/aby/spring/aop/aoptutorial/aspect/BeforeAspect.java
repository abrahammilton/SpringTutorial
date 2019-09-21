package com.aby.spring.aop.aoptutorial.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {
	
	private Logger log = LoggerFactory.getLogger(BeforeAspect.class);

	//any return type, package_name, all classes, all methods(irrespective of arguments)
	@Before("com.aby.spring.aop.aoptutorial.aspect.CommonJointPoint.dataLayer()")
	public void before(JoinPoint jp) {
		log.info("Intercepted method call {}", jp);
	}
}
