package com.example.springboot.shapes;

import java.awt.*;
import java.util.ArrayList;

public class Line extends Shape {

	protected String secondpositionX;
	protected String secondpositionY;

	public Line() {
		super();
		this.secondpositionX = null;
		this.secondpositionY = null;
	}

	public String getsecondpositionX() { return secondpositionX;}
	public String getsecondpositionY() { return secondpositionY;}
	public void setsseondpositonX(String x) {
		this.secondpositionX = x;
	}
	public void setsseondpositonY(String x) {
		this.secondpositionY = x;
	}



}
