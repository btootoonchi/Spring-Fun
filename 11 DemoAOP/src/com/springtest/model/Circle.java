package com.springtest.model;

public class Circle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("The set name method of the circle class runs and name is "+name);
	}
	
	public String returnName(String name) {
		this.name = name;
		System.out.println("Return name: "+name);
		return name;
	}
}
