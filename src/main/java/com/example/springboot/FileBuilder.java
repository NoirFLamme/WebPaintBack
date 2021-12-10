package com.example.springboot;

import org.json.*;


import java.beans.XMLEncoder;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.XMLFormatter;

public class FileBuilder {

    JSONObject shapesJ;
    JSONArray ellipseJ;
    JSONArray lineJ;
    JSONArray circleJ;
    JSONArray polygonJ;

    public FileBuilder(ArrayList<Shape> shapes) throws JSONException {
        JSONObject json = new JSONObject();
        for (int i = 0; i < shapes.size(); i++)
        {
            json.put("id", shapes.get(i).id);
            json.put("type", shapes.get(i).type);
            json.put("color", shapes.get(i).color);
            json.put("position.x", shapes.get(i).position.x);
            json.put("position.y", shapes.get(i).position.y);
            json.put("isSelected", shapes.get(i).isSelected);

            switch (shapes.get(i).type)
            {
                case "circle":
                    Circle circle = (Circle) shapes.get(i);
                    json.put("radius", circle.radius);
                    circleJ.put(json);
                    break;
                case "line":
                    Line line = (Line) shapes.get(i);
                    json.put("x1", line.x1);
                    json.put("x2", line.x2);
                    json.put("y1", line.y1);
                    json.put("y2", line.y2);
                    lineJ.put(json);
                    break;
                case "ellipse":
                    Elipse elipse = (Elipse) shapes.get(i);
                    json.put("radiusx", elipse.radiusx);
                    json.put("radiusy", elipse.radiusy);
                    ellipseJ.put(json);
                    break;
                case "polygon":
                    Polygon poly = (Polygon) shapes.get(i);
                    json.put("radiusx", poly.points);
                    polygonJ.put(json);
                    break;
            }

            Iterator keys = json.keys();
            while(keys.hasNext())
                json.remove((String)json.keys().next());
        }

        shapesJ.put("circle",circleJ);
        shapesJ.put("ellipse",ellipseJ);
        shapesJ.put("polygon",polygonJ);
        shapesJ.put("line",lineJ);

    }

    public JSONObject jsonBuilder()
    {
        return this.shapesJ;
    }



    public String  xmlBuilder() throws JSONException {
        String xml = XML.toString(this.shapesJ);
        return xml;
    }

}
