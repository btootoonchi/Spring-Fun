package com.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springtest.service.ShapeService;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		
		shapeService.getCircle().setName("Dummy name!");
//		shapeService.getCircle().returnName("Return name!");
		System.out.print(shapeService.getCircle().getName());
	}

}
