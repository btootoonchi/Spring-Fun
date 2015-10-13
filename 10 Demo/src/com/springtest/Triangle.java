package com.springtest;

public class Triangle {
	private String type;
	private String price;
	private int height;
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
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
		System.out.println("Point A: (x, y) = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
		System.out.println("Point B: (x, y) = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
		System.out.println("Point C: (x, y) = (" + getPointC().getX() + ", " + getPointC().getY() + ")");
	}
}
