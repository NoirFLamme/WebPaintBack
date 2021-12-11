package com.example.springboot.Converter;

import com.example.springboot.shapes.*;
import com.example.springboot.shapes.Polygon;
import com.example.springboot.shapes.Shape;
import org.json.JSONException;
import org.json.JSONObject;

import java.awt.*;

public class JSONtoShapeConv implements Converter<Shape, JSONObject>{

    public Shape create(JSONObject json) throws JSONException {

        Shape temp = null;
        temp.setType(json.getString("type"));
        temp.setPositionX(json.getString("position.x"));
        temp.setPositionY(json.getString("position.y"));
        temp.setId(json.getInt("id"));
        temp.setColor(json.getString("color"));

        switch (temp.getType())
        {
            case "circle":
                Circle circle = (Circle) temp;
                ((Circle) temp).setRadius(json.getInt("radius"));
                break;
            case "line":
                Line line = (Line) temp;
                ((Line) temp).setsseondpositonX(json.getString("secondPosition.x"));
                ((Line) temp).setsseondpositonY(json.getString("secondPosition.y"));
                break;
            case "ellipse":
                Elipse elipse = (Elipse) temp;
                ((Elipse) temp).setRadiusx(json.getInt("radiusx"));
                ((Elipse) temp).setRadiusy(json.getInt("radiusy"));
                break;
            case "polygon":
                Polygon poly = (Polygon) temp;
                ((Polygon) temp).setPoints(json.getString("points"));
                break;
        }

        return temp;
    }

}
