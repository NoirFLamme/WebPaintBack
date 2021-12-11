package com.example.springboot.shapes;

import java.awt.*;
import java.util.ArrayList;

public abstract class Shape {

	int id;
	protected String type;
	protected String color;
	protected Point position;
	protected boolean isSelected;

	public Shape() {
		id = 0;
		type = null;
		color = null;
		position.x = 0;
		position.y =0;
		isSelected = true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String t) {
		this.type = t;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean selected) {
		isSelected = selected;
	}

	abstract Shape select( ArrayList<Shape> Shapeslist, int i);
	abstract void move( Shape selectedShape);
	abstract void copy( Shape selectedShape);
	abstract void resize(Shape selectedShape);

}

