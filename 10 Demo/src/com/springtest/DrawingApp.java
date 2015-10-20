package com.springtest;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;

//@SuppressWarnings("deprecation")
public class DrawingApp {

	public static void main(String[] args) {
//		Triangle t = new Triangle();
		
		// spring.xml should be in the root path of the application, not in the src folder  
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		Triangle t = (Triangle) factory.getBean("triangle");
		
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle t = (Triangle) context.getBean("triangle1");

		t.draw();
	}

}
