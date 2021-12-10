package com.example.springboot;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class JSONShapeConverter {

    JSONObject shapesJ;
    JSONArray ellipseJ;
    JSONArray lineJ;
    JSONArray circleJ;
    JSONArray polygonJ;

    ArrayList<Shape> convertedJson;

    public JSONObject ShapesToJson (ArrayList<Shape> shapes) throws JSONException {
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

        return shapesJ;

    }

    public ArrayList<Shape> JsontoShape (JSONObject json) throws JSONException {

        Shape temp = null;
        Iterator keys = json.keys();
        while(keys.hasNext())
        {
            JSONArray sh = json.getJSONArray((String)json.keys().next());
            for (int i = 0; i < sh.length(); i++)
            {
                JSONObject type = sh.getJSONObject(i);
                temp.type = type.getString("type");
                temp.position.x = type.getInt("position.x");
                temp.position.y = type.getInt("position.y");
                temp.id = type.getInt("id");
                temp.color = type.getString("color");
                temp.isSelected = type.getBoolean("isSelected");

                switch (keys.toString())
                {
                    case "circle":
                        Circle circle = (Circle) temp;
                        ((Circle) temp).radius = type.getInt("radius");
                        convertedJson.add(circle);
                        break;
                    case "line":
                        Line line = (Line) temp;
                        ((Line) temp).x1 = type.getInt("x1");
                        ((Line) temp).x2 = type.getInt("x2");
                        ((Line) temp).y1 = type.getInt("y1");
                        ((Line) temp).y2 = type.getInt("y2");
                        convertedJson.add(line);
                        break;
                    case "ellipse":
                        Elipse elipse = (Elipse) temp;
                        ((Elipse) temp).radiusx = type.getInt("radiusx");
                        ((Elipse) temp).radiusy = type.getInt("radiusy");
                        convertedJson.add(elipse);
                        break;
                    case "polygon":
                        Polygon poly = (Polygon) temp;
                        ((Polygon) temp).points = type.getString("points");
                        convertedJson.add(poly);
                        break;
                }
            }
        }

        return convertedJson;

    }

}
