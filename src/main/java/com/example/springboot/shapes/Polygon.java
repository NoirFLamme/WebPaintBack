package com.example.springboot.shapes;

import java.util.ArrayList;

public class Polygon extends Shape {

	protected String points;

	public Polygon() {
		super();
		points = null;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}


}
