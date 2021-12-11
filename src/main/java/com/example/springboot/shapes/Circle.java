package com.example.springboot.shapes;

import java.util.ArrayList;

public class Circle extends Shape{
	protected String radius;

	public Circle() {
		super();
		radius = "";
	}

	public String getRadius() {
		return radius;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

}
