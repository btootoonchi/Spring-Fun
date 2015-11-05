package com.springtest.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	/** 
	 * This is the method which I would like to execute
	 * before a selected method execution.
	*/
	@Before("execution(public * get*())")
	public void loggingAdvice() {
		System.out.println("Advicr run. Get Method called.");
	}
}
