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

	@Override
	Shape select(ArrayList<Shape> Shapeslist, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void move(Shape selectedShape) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void copy(Shape selectedShape) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void resize(Shape selectedShape) {
		// TODO Auto-generated method stub
		
	}

}
