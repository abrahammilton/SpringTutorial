package com.aby.spring.aop.aoptutorial.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {

	private Logger log = LoggerFactory.getLogger(AfterAspect.class);

	// any return type, package_name, all classes, all methods(irrespective of arguments)
	@AfterReturning(value = "com.aby.spring.aop.aoptutorial.aspect.CommonJointPoint.businessLayer()", returning = "result")
	public void after(JoinPoint jp, Object result) {
		log.info("{} returned value {}", jp, result);
	}
}
