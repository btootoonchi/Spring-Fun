package com.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		HelloWorld obj = (HelloWorld) context.getBean(HelloWorld.class);

		obj.setMessage("Hello World!");
		obj.getMessage();

	}

}
