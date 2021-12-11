package com.example.springboot.shapes;

import java.awt.*;
import java.util.ArrayList;

public class Line extends Shape {

	protected Point secondposition;

	public Line() {
		super();
		this.secondposition = null;
	}

	public Point getsecondposition() { return secondposition;}

	public void setsseondpositon(Point x) {
		this.secondposition = x;
	}



}
