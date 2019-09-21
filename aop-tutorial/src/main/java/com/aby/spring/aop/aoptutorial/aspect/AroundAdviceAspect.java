package com.aby.spring.aop.aoptutorial.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAdviceAspect {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	// any return type, package_name, all classes, all methods(irrespective of arguments)
	@Around(value = "execution(* com.aby.spring.aop.aoptutorial.aspect.CommonJointPoint.trackTimeAspect())")
	public void calculateTimeTaken(ProceedingJoinPoint jp) throws Throwable {
		
		long startTime = System.currentTimeMillis();
		jp.proceed();
		long endTime = System.currentTimeMillis() - startTime;
		log.info("Time taken by {} is {}", jp, endTime);
	}
}
