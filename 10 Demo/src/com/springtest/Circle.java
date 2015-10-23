package com.springtest;

public class Circle implements Shape {
	private Point center;

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a circle. center is (" + center.getX() + ", " + center.getY() +")");
	}
}
