package com.aby.spring.aop.aoptutorial.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJointPoint {

	@Pointcut("execution(* com.aby.spring.aop.aoptutorial.data.*.*(..))")
	public void dataLayer() {}
	
	@Pointcut("execution(* com.aby.spring.aop.aoptutorial.business.*.*(..))")
	public void businessLayer() {}
	
	@Pointcut("@annotation(com.aby.spring.aop.aoptutorial.aspect.TrackTime)")
	public void trackTimeAspect() {}
	
	
}

