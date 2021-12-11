package com.example.springboot.shapes;

import java.util.ArrayList;

public class Circle extends Shape{
	protected int radius;

	public Circle() {
		super();
		radius = 0;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
