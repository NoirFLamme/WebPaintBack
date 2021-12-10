package com.example.springboot;

import java.util.ArrayList;

public class Rectangle extends Shape {
	protected int rX, rY, rWidth, rHight;

	public Rectangle() {
		super();
		rX = 0;
		rY = 0;
		rWidth = 0;
		rHight = 0;
	}

	public int getrX() {
		return rX;
	}

	public void setrX(int rX) {
		this.rX = rX;
	}

	public int getrY() {
		return rY;
	}

	public void setrY(int rY) {
		this.rY = rY;
	}

	public int getrWidth() {
		return rWidth;
	}

	public void setrWidth(int rWidth) {
		this.rWidth = rWidth;
	}

	public int getrHight() {
		return rHight;
	}

	public void setrHight(int rHight) {
		this.rHight = rHight;
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
