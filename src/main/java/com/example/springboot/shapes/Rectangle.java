package com.example.springboot.shapes;

import java.util.ArrayList;

public class Rectangle extends Shape{
    @Override
    public String getWidth() {
        return width;
    }

    @Override
    public void setWidth(String width) {
        this.width = width;
    }

    @Override
    public String getHeight() {
        return height;
    }

    @Override
    public void setHeight(String height) {
        this.height = height;
    }

    protected String width;
    protected String height;

    public Rectangle() {
        super();
        width = "";
        height = "";
    }



}
