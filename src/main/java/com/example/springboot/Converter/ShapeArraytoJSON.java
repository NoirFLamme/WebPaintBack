package com.example.springboot.Converter;

import com.example.springboot.shapes.Shape;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

public class ShapeArraytoJSON  implements Converter<JSONObject, ArrayList<Shape>>{

    JSONArray ellipseJ;
    JSONArray lineJ;
    JSONArray circleJ;
    JSONArray polygonJ;

    JSONObject shapesJ;

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
}
