package com.example.springboot.shapes;

import java.awt.*;
import java.util.ArrayList;

public  class Shape {

	protected String id;
	protected String type;
	protected String points;
	protected String color;
	protected String positionX;
	protected String positionY;
	protected String secondpositionX;
	protected String secondpositionY;
	protected String radiusx, radiusy;
	protected String width;
	protected String height;



	protected String radius;

	public Shape(String  id, String type, String points, String color, String positionX, String positionY, String secondpositionX, String secondpositionY, String radiusx, String radiusy, String width, String height, String radius) {
		this.id = id;
		this.type = type;
		this.points = points;
		this.color = color;
		this.positionX = positionX;
		this.positionY = positionY;
		this.secondpositionX = secondpositionX;
		this.secondpositionY = secondpositionY;
		this.radiusx = radiusx;
		this.radiusy = radiusy;
		this.width = width;
		this.height = height;
		this.radius = radius;
	}





	public Shape() {

		this.id = "";
		this.type = "";
		this.points = "";
		this.color = "";
		this.positionX = "";
		this.positionY = "";
		this.secondpositionX = "";
		this.secondpositionY = "";
		this.radiusx = "";
		this.radiusy ="";
		this.width = "";
		this.height = "";
		this.radius = "";
	}




	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}


	public String getRadiusx() {
		return radiusx;
	}

	public void setRadiusx(String radiusx) {
		this.radiusx = radiusx;
	}

	public String getRadiusy() {
		return radiusy;
	}

	public void setRadiusy(String radiusy) {
		this.radiusy = radiusy;
	}

	public String getSecondpositionX() {
		return secondpositionX;
	}

	public void setSecondpositionX(String secondpositionX) {
		this.secondpositionX = secondpositionX;
	}

	public String getSecondpositionY() {
		return secondpositionY;
	}

	public void setSecondpositionY(String secondpositionY) {
		this.secondpositionY = secondpositionY;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getRadius() {
		return radius;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}







}
