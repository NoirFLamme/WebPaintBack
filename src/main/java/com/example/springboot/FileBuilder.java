package com.example.springboot;

import org.json.*;


import java.beans.XMLEncoder;
import java.io.File;
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
