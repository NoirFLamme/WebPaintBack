package com.example.springboot;

import java.util.ArrayList;

public class Circle extends Shape{
	protected int x, y, radius;

	public Circle() {
		super();
		x = y = radius = 0;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}



	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
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
