package com.example.springboot.Converter;

import com.example.springboot.shapes.Shape;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

public class JSONToShapeArray implements Converter<ArrayList<Shape>, JSONObject>{


    ArrayList<Shape> convertedJson;


    public ArrayList<Shape> create (JSONObject json) throws JSONException {

        Shape temp = null;
        JSONtoShapeConv mapper = new JSONtoShapeConv();
        Iterator keys = json.keys();
        while(keys.hasNext())
        {
            JSONArray sh = json.getJSONArray((String)json.keys().next());
            for (int i = 0; i < sh.length(); i++)
            {
                JSONObject type = sh.getJSONObject(i);
                convertedJson.add(mapper.create(type));

            }
        }

        return convertedJson;

    }
}
