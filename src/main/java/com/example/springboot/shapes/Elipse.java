package com.example.springboot.shapes;

import java.util.ArrayList;

public class Elipse extends Shape {
	protected int radiusx, radiusy;
	

	public Elipse() {
		super();
		radiusx = 0;
		radiusy = 0;
	}

	public int getRadiusx() {
		return radiusx;
	}

	public void setRadiusx(int radiusx) {
		this.radiusx = radiusx;
	}

	public int getRadiusy() {
		return radiusy;
	}

	public void setRadiusy(int radiusy) {
		this.radiusy = radiusy;
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
