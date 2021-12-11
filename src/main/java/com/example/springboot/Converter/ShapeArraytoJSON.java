package com.example.springboot.Converter;

import com.example.springboot.shapes.Shape;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ShapeArraytoJSON  implements Converter<JSONObject, ArrayList<Shape>>{

    JSONArray ellipseJ = new JSONArray();
    JSONArray lineJ= new JSONArray();
    JSONArray circleJ = new JSONArray();
    JSONArray polygonJ= new JSONArray();
    JSONArray rectJ= new JSONArray();

    JSONObject shapesJ = new JSONObject();

    public JSONObject create (ArrayList<Shape> shapes) throws JSONException {
        JSONObject json = new JSONObject();
        JSONShapeConverter conv = new JSONShapeConverter();
        for (int i = 0; i < shapes.size(); i++)
        {
            json = conv.create(shapes.get(i));
            switch (shapes.get(i).getType())
            {
                case "circle":
                    circleJ.put(json);
                    break;
                case "rectangle":
                    rectJ.put(json);
                    break;
                case "line":
                    lineJ.put(json);
                    break;
                case "ellipse":
                    ellipseJ.put(json);
                    break;
                case "polygon":
                    polygonJ.put(json);
                    break;
            }




        }

        shapesJ.put("circle",circleJ);
        shapesJ.put("ellipse",ellipseJ);
        shapesJ.put("polygon",polygonJ);
        shapesJ.put("line",lineJ);
        shapesJ.put("rectangle",rectJ);

        return shapesJ;

    }
}
