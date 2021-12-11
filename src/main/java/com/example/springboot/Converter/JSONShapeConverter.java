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
            json.put("positionX", shape.getPositionX());
            json.put("positionY", shape.getPositionY());

            switch (shape.getType())
            {
                case "circle":
                    json.put("radius", shape.getRadius());
                    break;
                case "line":

                    json.put("secondPosition.x", shape.getSecondpositionX());
                    json.put("secondPosition.y", shape.getSecondpositionY());
                    break;
                case "ellipse":

                    json.put("radiusx", shape.getRadiusx());
                    json.put("radiusy", shape.getRadiusy());
                    break;
                case "polygon":

                    json.put("radiusx", shape.getPoints());
                    break;
            }
        System.out.println();
        return json;

    }




}
