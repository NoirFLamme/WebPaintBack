package com.example.springboot.Converter;

import com.example.springboot.shapes.Circle;
import com.example.springboot.shapes.Elipse;
import com.example.springboot.shapes.Line;
import com.example.springboot.shapes.Polygon;
import com.example.springboot.shapes.Shape;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class JSONShapeConverter implements Converter<JSONObject, Shape>{


    ArrayList<Shape> convertedJson;

    public JSONObject create (Shape shape) throws JSONException {
        JSONObject json = new JSONObject();
            json.put("id", shape.getId());
            json.put("type", shape.getType());
            json.put("color", shape.getColor());
            json.put("position.x", shape.getPosition().x);
            json.put("position.y", shape.getPosition().y);

            switch (shape.getType())
            {
                case "circle":
                    Circle circle = (Circle) shape;
                    json.put("radius", circle.getRadius());
                    break;
                case "line":
                    Line line = (Line) shape;
                    json.put("secondPosition", line.getsecondposition());
                    break;
                case "ellipse":
                    Elipse elipse = (Elipse) shape;
                    json.put("radiusx", elipse.getRadiusx());
                    json.put("radiusy", elipse.getRadiusy());
                    break;
                case "polygon":
                    Polygon poly = (Polygon) shape;
                    json.put("radiusx", poly.getPoints());
                    break;
            }


        return json;

    }




}
