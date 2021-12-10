package com.example.springboot;

import java.util.ArrayList;

public class Triangle extends Shape {

	protected int x1, x2, y1, y2,x3,y3;

	public Triangle() {
		super();
		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;
		x3 = 0;
		y3 = 0;
	}
	
	
	public int getX1() {
		return x1;
	}


	public void setX1(int x1) {
		this.x1 = x1;
	}


	public int getX2() {
		return x2;
	}


	public void setX2(int x2) {
		this.x2 = x2;
	}


	public int getY1() {
		return y1;
	}


	public void setY1(int y1) {
		this.y1 = y1;
	}


	public int getY2() {
		return y2;
	}


	public void setY2(int y2) {
		this.y2 = y2;
	}


	public int getX3() {
		return x3;
	}


	public void setX3(int x3) {
		this.x3 = x3;
	}


	public int getY3() {
		return y3;
	}


	public void setY3(int y3) {
		this.y3 = y3;
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
