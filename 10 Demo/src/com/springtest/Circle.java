package com.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
	private Point center;

	public Point getCenter() {
		return center;
	}

//	@Required
	@Qualifier("circleRelated")
	@Autowired
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a circle. center is (" + center.getX() + ", " + center.getY() +")");
	}
}
