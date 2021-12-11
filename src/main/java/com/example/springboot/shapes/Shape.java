package com.example.springboot.shapes;

import java.awt.*;
import java.util.ArrayList;

public  class Shape {

	int id;

	public Shape(int id, String type, String color, String positionX, String positionY) {
		this.id = id;
		this.type = type;
		this.color = color;
		this.positionX = positionX;
		this.positionY = positionY;

	}

	public Shape() {

		id = 0;
		type = null;
		color = null;
		positionX = "";
		positionY = "";
	}

	protected String type;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPositionX() {
		return positionX;
	}

	public void setPositionX(String positionX) {
		this.positionX = positionX;
	}

	public String getPositionY() {
		return positionY;
	}

	public void setPositionY(String positionY) {
		this.positionY = positionY;
	}



	protected String color;
	protected String positionX;
	protected String positionY;







}
