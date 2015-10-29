package com.springtest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {
	private Point center;

	public Point getCenter() {
		return center;
	}

	@Resource(name="pointA")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a circle. center is (" + center.getX() + ", " + center.getY() +")");
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
