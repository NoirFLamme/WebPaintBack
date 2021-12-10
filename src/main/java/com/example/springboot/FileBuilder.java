package com.example.springboot;

import org.json.*;


import java.io.File;
import java.util.ArrayList;

public class FileBuilder {
    protected JSONObject json;

    public FileBuilder(ArrayList<Shape> shapes){
        json = new JSONObject();

        try {
            json.put("Shapes", shapes);
        } catch (JSONException e)
        {
            System.out.println("JSONException");
        }
    }

    public JSONObject jsonBuilder(){
        return this.json;
    }

//    public File xmlBuilder(){
//        String xml = XML.toString(this.json);
//        return XML.tos;
//    }

}
