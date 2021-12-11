package com.example.springboot.shapes;

import java.util.ArrayList;

public class Elipse extends Shape {
	protected int radiusx, radiusy;
	

	public Elipse(Shape a) {
		super(a);
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



}
