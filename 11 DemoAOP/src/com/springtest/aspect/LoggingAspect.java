package com.springtest.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.springtest.model.Circle;

@Aspect
public class LoggingAspect {
	
	/** 
	 * This is the method which I would like to execute
	 * before a selected method execution.
	*/
	@Before("allCircleMethods()")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println("Advice run. Get Method called.");
		System.out.println(joinPoint.getTarget());
		
		Circle circle = (Circle) joinPoint.getTarget();
	}
	
	@Before("args(name)")
	public void stringArgumentsMethod(String name) {
	/*@Before("args(String)")
	public void stringArgumentsMethod() {
		System.out.println("A method that takes String arguments has been called.");*/
		System.out.println("A method that takes String arguments has been called. The name is " + name);
	}
	
	@After("args(name)")
	@AfterReturning("args(name)")
	@AfterThrowing("args(name)")
	public void afterAdviceMethod(String name) {
		System.out.println("After annotation executed. The name is "+ name);
	}
	
	/*@AfterReturning(pointcut="args(name)", returning="retrunString")
	public void afterReturnningAdvic(String name, String returnString) {
		System.out.println("The after returnnig advic runs and name is "+name+". The return string is "+returnString);
	}*/
	
	@Before("allGetters()")
	public void gettingAdvice() {
		System.out.println("Getting Advice run. Get Method called.");
	}
	
	@Pointcut("execution(public * get*())")
	public void allGetters() {}
	
//	@Pointcut("execution(* * com.springtest.model.Circle.*(..))")
	@Pointcut("within(com.springtest.model.Circle)") // for all methods
//	@Pointcut("within(com.springtest.model.*)") // for all classes 
//	@Pointcut("within(com.springtest.model..)") //also for sub packages
	public void allCircleMethods() {}
	
	@Around("allGetters()")
	public Object aroundAdvice(ProceedingJoinPoint preceedingJoinPoint) {
		Object object = null;
		try {
			System.out.println("Before Around Advice");
			object = preceedingJoinPoint.proceed();
			System.out.println("After Around Advice");
		} catch (Throwable e) {
			System.out.println("Throwing Around Advice");
//			e.printStackTrace();
		}
		System.out.println("After Finally Around Advice");
		
		return object;
	}
}
