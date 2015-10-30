package com.springtest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

@Controller
public class Circle implements Shape, ApplicationEventPublisherAware {
	private Point center;
	private ApplicationEventPublisher publisher;
	
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
		
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}
	
	@PostConstruct
	public void init(){
		System.out.println("Init of Circle.");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("Destroy of Circle.");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
}
