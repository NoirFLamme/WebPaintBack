package com.example.springboot.shapes;

import java.util.ArrayList;

public class Elipse extends Shape {
	protected String radiusx, radiusy;
	

	public Elipse(Shape a) {

		radiusx = "";
		radiusy = "";
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



}
