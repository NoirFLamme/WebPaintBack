package com.example.springboot;

import org.json.*;


import java.beans.XMLEncoder;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.XMLFormatter;

public class FileBuilder {

    JSONShapeConverter converter = new  JSONShapeConverter();
    public JSONObject jsonBuilder(ArrayList<Shape>shapes) throws JSONException {
        return converter.ShapesToJson(shapes);
    }



    public String  xmlBuilder(ArrayList<Shape>shapes) throws JSONException {
        String xml = XML.toString(converter.ShapesToJson(shapes));
        return xml;
    }

}
