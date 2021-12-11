package com.example.springboot;

import com.example.springboot.shapes.*;

public class ShapeFactory {
    public Shape create(Object sentobject)
    {

        Shape sentobj = (Shape) sentobject;

        if (sentobj != null)
        {
            if (sentobj.getType().equalsIgnoreCase("circle"))
            {
                Circle circle = new Circle();
                circle.setType(sentobj.getType());
                circle.setPosition(sentobj.getPosition());
                circle.setRadius(((Circle) sentobj).getRadius());
                circle.setColor(sentobj.getColor());
                circle.setId( sentobj.getId());

                return circle;
            }
            else if (sentobj.getType().equalsIgnoreCase("polygon"))
            {
                Polygon poly = new Polygon();
                poly.setType(sentobj.getType());
                poly.setPosition(sentobj.getPosition());
                poly.setPoints(((Polygon) sentobj).getPoints());
                poly.setColor(sentobj.getColor());
                poly.setId( sentobj.getId());

                return poly;
            }
            else if (sentobj.getType().equalsIgnoreCase("elipse"))
            {
                Elipse elipse = new Elipse();
                elipse.setType(sentobj.getType());
                elipse.setPosition(sentobj.getPosition());
                elipse.setRadiusx(((Elipse) sentobj).getRadiusx());
                elipse.setRadiusy( ((Elipse) sentobj).getRadiusy());
                elipse.setColor(sentobj.getColor());
                elipse.setId( sentobj.getId());
                return elipse;
            }
            else if (sentobj.getType().equalsIgnoreCase("line"))
            {
                Line line = new Line();
                line.setType(sentobj.getType());
                line.setPosition(sentobj.getPosition());
                line.setsseondpositon(((Line) sentobj).getsecondposition());;
                line.setColor(sentobj.getColor());
                line.setId( sentobj.getId());

                return line;
            }
        }

        return null;
    }
}
