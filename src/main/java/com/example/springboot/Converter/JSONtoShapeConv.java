package com.example.springboot.Converter;

import com.example.springboot.shapes.*;
import com.example.springboot.shapes.Polygon;
import com.example.springboot.shapes.Rectangle;
import com.example.springboot.shapes.Shape;
import org.json.JSONException;
import org.json.JSONObject;

import java.awt.*;

public class JSONtoShapeConv implements Converter<Shape, JSONObject>{

    public Shape create(JSONObject json) throws JSONException {

        Shape temp = new Shape();
        temp.setType(json.getString("type"));
        temp.setPositionX(json.getString("position.x"));
        temp.setPositionY(json.getString("position.y"));
        temp.setId(json.getString("id"));
        temp.setColor(json.getString("color"));

        switch (temp.getType())
        {
            case "circle":
                temp.setRadius(json.getString("radius"));
                break;

            case "rectangle":
                temp.setWidth(json.getString("width"));
                temp.setHeight(json.getString("height"));
                break;
            case "line":
                temp.setSecondpositionX(json.getString("secondPositionX"));
                temp.setSecondpositionY(json.getString("secondPositionY"));
                break;
            case "ellipse":
                 temp.setRadiusx(json.getString("radiusx"));
                 temp.setRadiusy(json.getString("radiusy"));
                break;
            case "polygon":
                 temp.setPoints(json.getString("points"));
                break;
        }

        return temp;
    }

}
