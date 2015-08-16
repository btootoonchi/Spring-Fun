package com.springtest;

/*import org.springframework.context.ApplicationContext;*/
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		/*ApplicationContext context = 
				new ClassPathXmlApplicationContext("Beans.xml");*/
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

		obj.getMessage();
		context.registerShutdownHook(); //added for destroy method
		
		SingletonScope objSingleton = (SingletonScope) context.getBean("singletonScope");
		objSingleton.setMessage("I am objSingleton!");
		objSingleton.getMessage();
		
		SingletonScope objSingletonScope = (SingletonScope) context.getBean("singletonScope");
		objSingletonScope.getMessage();
		
		PrototypeScope objPrototype = (PrototypeScope) context.getBean("prototypeScope");
		objPrototype.setMessage("I am objPrototype!");
		objPrototype.getMessage();
		
		PrototypeScope objPrototypeScope = (PrototypeScope) context.getBean("prototypeScope");
		objPrototypeScope.getMessage();
	}
}
