package com.example.springboot.Converter;

import com.example.springboot.shapes.*;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONtoShapeConv implements Converter<Shape, JSONObject>{

    public Shape create(JSONObject json) throws JSONException {

        Shape temp = null;
        temp.type = json.getString("type");
        temp.position.x = json.getInt("position.x");
        temp.position.y = json.getInt("position.y");
        temp.id = json.getInt("id");
        temp.color = json.getString("color");
        temp.isSelected = json.getBoolean("isSelected");

        switch (temp.type)
        {
            case "circle":
                Circle circle = (Circle) temp;
                ((Circle) temp).radius = json.getInt("radius");
                break;
            case "line":
                Line line = (Line) temp;
                ((Line) temp).x1 = json.getInt("x1");
                ((Line) temp).x2 = json.getInt("x2");
                ((Line) temp).y1 = json.getInt("y1");
                ((Line) temp).y2 = json.getInt("y2");
                break;
            case "ellipse":
                Elipse elipse = (Elipse) temp;
                ((Elipse) temp).radiusx = json.getInt("radiusx");
                ((Elipse) temp).radiusy = json.getInt("radiusy");
                break;
            case "polygon":
                Polygon poly = (Polygon) temp;
                ((Polygon) temp).points = json.getString("points");
                break;
        }

        return temp;
    }

}
