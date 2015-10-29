package com.springtest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

@Controller
public class Circle implements Shape {
	private Point center;

	@Autowired
	private MessageSource messageSource; 
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}

	@Resource(name="pointA")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println(this.messageSource.getMessage("Drawing.Circle", null, "Default Drawing Circle Message", null) +
				this.messageSource.getMessage("Drawing.Point", new Object[] {center.getX(), center.getY()}, "Default Point Circle Message", null)
				);
	}
	
	@PostConstruct
	public void init(){
		System.out.println("Init of Circle.");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("Destroy of Circle.");
	}
}
