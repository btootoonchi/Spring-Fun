package com.springtest;

import java.util.List;

public class Triangle {
	private String type;
	private String price;
	private int height;
	
	private Point pointA;
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

	private Point pointB;
	private Point pointC;


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
}
