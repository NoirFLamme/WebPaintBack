package com.example.springboot;

import com.example.springboot.shapes.*;

public class ShapeFactory {
    public Shape create(Object sentobject)
    {

        Shape sentobj = (Shape) sentobject;

        if (sentobj == null)
        {
            return null;
        }
        else if (sentobj.type.equalsIgnoreCase("circle"))
        {
            Circle circle = new Circle();
            circle.type = sentobj.type;
            circle.position = sentobj.position;
            circle.radius = ((Circle) sentobj).radius;
            circle.color = sentobj.color;
            circle.id = sentobj.id;
            circle.isSelected = sentobj.isSelected;

            return circle;
        }
        else if (sentobj.type.equalsIgnoreCase("polygon"))
        {
            Polygon poly = new Polygon();
            poly.type = sentobj.type;
            poly.points = ((Polygon) sentobj).points;
            poly.color = sentobj.color;
            poly.position = sentobj.position;
            poly.isSelected = sentobj.isSelected;
            poly.id = sentobj.id;

            return poly;
        }
        else if (sentobj.type.equalsIgnoreCase("elipse"))
        {
            Elipse elipse = new Elipse();
            elipse.type = sentobj.type;
            elipse.radiusx = ((Elipse) sentobj).radiusx;
            elipse.radiusy = ((Elipse) sentobj).radiusy;
            elipse.color = sentobj.color;
            elipse.isSelected = sentobj.isSelected;
            elipse.id = sentobj.id;
            elipse.position = sentobj.position;

            return elipse;
        }
        else if (sentobj.type.equalsIgnoreCase("line"))
        {
            Line line = new Line();
            line.type = sentobj.type;
            line.x1 = ((Line) sentobj).x1;
            line.x2 = ((Line) sentobj).x2;
            line.y1 = ((Line) sentobj).y1;
            line.y2 = ((Line) sentobj).y2;
            line.color = sentobj.color;
            line.position = sentobj.position;
            line.isSelected = sentobj.isSelected;
            line.id = sentobj.id;

            return line;
        }
        return null;
    }
}
