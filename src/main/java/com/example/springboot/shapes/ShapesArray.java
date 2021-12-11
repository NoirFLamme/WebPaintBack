package com.example.springboot.shapes;

import java.awt.*;
import java.util.ArrayList;

public class ShapesArray {
    public ArrayList<Shape> shapes;
    public ShapesArray(){}
    {
        this.shapes = null;
    }

    public void AddShape(Shape drawing){
        this.shapes.add(drawing);
    }

    public void removeShape(int id){
        for (int i = 0;i < this.shapes.size();i++){
            if(id == this.shapes.get(i).id)
               this.shapes.remove(i);
        }
    }

    public Shape GetShape(int id){
        for (int i = 0;i < this.shapes.size();i++){
            if(id == this.shapes.get(i).id)
                return this.shapes.get(i);
        }
        return null;
    }

    public void EditShape(Shape a){
        for (int i = 0;i < this.shapes.size();i++){
            if(a.id == this.shapes.get(i).id) {
                this.shapes.set(i, a);
                return;
            }
        }
        this.shapes.add(a);
    }

    public void copy(int id, int new_id, Point position) {
        Shape a = GetShape(id);
        a.id = new_id;
        a.position = position;
        EditShape(a);
    }
}
