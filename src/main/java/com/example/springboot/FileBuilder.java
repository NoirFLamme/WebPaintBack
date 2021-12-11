package com.example.springboot;

import com.example.springboot.Converter.ShapeArraytoJSON;
import com.example.springboot.shapes.Shape;
import org.json.*;


import java.util.ArrayList;



public class FileBuilder {

    ShapeArraytoJSON converterJ = new ShapeArraytoJSON();
    public JSONObject jsonBuilder(ArrayList<Shape>shapes) throws JSONException {
        return converterJ.create(shapes);
    }



    public String  xmlBuilder(ArrayList<Shape>shapes) throws JSONException {
        String xml = XML.toString(converterJ.create(shapes));
        return xml;
    }

}
