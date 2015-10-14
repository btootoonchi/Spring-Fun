package com.springtest;

import java.util.List;

public class Triangle {
	private String type;
	private String price;
	private int height;
	
	private List<Point> points;
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
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
		for(Point point: points) {
			System.out.println("Point : (x, y) = (" + point.getX() + ", " + point.getY() + ")");
		}
	}
}
