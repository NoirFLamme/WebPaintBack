package com.example.springboot;

import java.util.ArrayList;

public class Elipse extends Shape {
	protected int cX, cY, cWidth, cHight;
	

	public Elipse() {
		super();
		cX = 0;
		cY = 0;
		cWidth = 0;
		cHight = 0;
	}

	public int getcX() {
		return cX;
	}

	public void setcX(int cX) {
		this.cX = cX;
	}

	public int getcY() {
		return cY;
	}

	public void setcY(int cY) {
		this.cY = cY;
	}

	public int getcWidth() {
		return cWidth;
	}

	public void setcWidth(int cWidth) {
		this.cWidth = cWidth;
	}

	public int getcHight() {
		return cHight;
	}

	public void setcHight(int cHight) {
		this.cHight = cHight;
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
