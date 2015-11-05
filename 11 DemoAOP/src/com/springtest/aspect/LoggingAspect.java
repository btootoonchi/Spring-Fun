package com.springtest.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	/** 
	 * This is the method which I would like to execute
	 * before a selected method execution.
	*/
	@Before("allGetters()")
	public void loggingAdvice() {
		System.out.println("Advice run. Get Method called.");
	}
	
	@Before("allGetters()")
	public void gettingAdvice() {
		System.out.println("Getting Advice run. Get Method called.");
	}
	
	@Pointcut("execution(public * get*())")
	public void allGetters() {}
}
