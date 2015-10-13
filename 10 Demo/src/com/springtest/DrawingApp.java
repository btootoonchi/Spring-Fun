package com.springtest;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
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
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle t = (Triangle) context.getBean("triangle-aliases");

		t.draw();
	}

}
