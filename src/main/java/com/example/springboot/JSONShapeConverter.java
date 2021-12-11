package com.example.springboot;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class JSONShapeConverter implements Converter<JSONObject, Shape>{


    ArrayList<Shape> convertedJson;

    public JSONObject create (Shape shape) throws JSONException {
        JSONObject json = new JSONObject();
            json.put("id", shape.id);
            json.put("type", shape.type);
            json.put("color", shape.color);
            json.put("position.x", shape.position.x);
            json.put("position.y", shape.position.y);
            json.put("isSelected", shape.isSelected);

            switch (shape.type)
            {
                case "circle":
                    Circle circle = (Circle) shape;
                    json.put("radius", circle.radius);
                    break;
                case "line":
                    Line line = (Line) shape;
                    json.put("x1", line.x1);
                    json.put("x2", line.x2);
                    json.put("y1", line.y1);
                    json.put("y2", line.y2);
                    break;
                case "ellipse":
                    Elipse elipse = (Elipse) shape;
                    json.put("radiusx", elipse.radiusx);
                    json.put("radiusy", elipse.radiusy);
                    break;
                case "polygon":
                    Polygon poly = (Polygon) shape;
                    json.put("radiusx", poly.points);
                    break;
            }


        return json;

    }




}
