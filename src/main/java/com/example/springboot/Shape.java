package com.example.springboot;

import java.util.ArrayList;

public abstract class Shape {

	protected String color;
	protected String name;
	protected boolean isFilled;
	protected boolean isDraw;

	public Shape() {
		color = null;
		name = null;
		isFilled = true;
		isDraw = true;
	}

	public boolean isDraw() {
		return isDraw;
	}

	public void setDraw(boolean isDraw) {
		this.isDraw = isDraw;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

	public void setColor(String c) {
		color = c;
	}

	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract Shape select( ArrayList<Shape> Shapeslist, int i);

	abstract void move( Shape selectedShape);
	abstract void copy( Shape selectedShape);
	abstract void resize(Shape selectedShape);




}

