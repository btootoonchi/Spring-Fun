package com.springtest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {
	private String type;
	private String price;
	private int height;
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	private ApplicationContext context;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Triangle(String price) {
		this.price = price;
	}
	
	public Triangle(String price, int height) {
		this.price = price;
		this.height = height;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void draw() {
		System.out.println("Type is " + this.type + ", price is " + this.price + ", and heoght is " + this.height + " Draw a Triangle!");
		System.out.println("Point A: (x, y) = (" + pointA.getX() + ", " + pointA.getY() + ")");
		System.out.println("Point B: (x, y) = (" + pointB.getX() + ", " + pointB.getY() + ")");
		System.out.println("Point C: (x, y) = (" + pointC.getX() + ", " + pointC.getY() + ")");
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name is " + beanName);
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}
}
