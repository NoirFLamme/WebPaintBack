package com.example.springboot;

import com.example.springboot.shapes.*;

public class ShapeFactory {
    public Shape create(Shape sentobj)
    {


        if (sentobj != null)
        {
            if (sentobj.getType().equalsIgnoreCase("circle"))
            {
                Circle circle = new Circle();
                circle.setType(sentobj.getType());
                circle.setPositionX(sentobj.getPositionX());
                circle.setPositionY(sentobj.getPositionY());
                circle.setRadius( sentobj.getRadius());
                circle.setColor(sentobj.getColor());
                circle.setId( sentobj.getId());

                return circle;
            }
            else if (sentobj.getType().equalsIgnoreCase("polygon"))
            {
                Polygon poly = new Polygon();
                poly.setType(sentobj.getType());
                poly.setPositionX(sentobj.getPositionX());
                poly.setPositionY(sentobj.getPositionY());
                poly.setPoints(( sentobj).getPoints());
                poly.setColor(sentobj.getColor());
                poly.setId( sentobj.getId());

                return poly;
            }
            else if (sentobj.getType().equalsIgnoreCase("elipse"))
            {
                Elipse elipse = new Elipse(sentobj);
                elipse.setType(sentobj.getType());
                elipse.setPositionX(sentobj.getPositionX());
                elipse.setPositionY(sentobj.getPositionY());
                elipse.setRadiusx(( sentobj).getRadiusx());
                elipse.setRadiusy( ( sentobj).getRadiusy());
                elipse.setColor(sentobj.getColor());
                elipse.setId( sentobj.getId());
                return elipse;
            }
            else if (sentobj.getType().equalsIgnoreCase("rectangle"))
            {
                Rectangle rectangle = new Rectangle();
                rectangle.setType(sentobj.getType());
                rectangle.setPositionX(sentobj.getPositionX());
                rectangle.setPositionY(sentobj.getPositionY());
                rectangle.setRadiusx(( sentobj).getRadiusx());
                rectangle.setRadiusy( ( sentobj).getRadiusy());
                rectangle.setColor(sentobj.getColor());
                rectangle.setId( sentobj.getId());
                return rectangle;
            }
            else if (sentobj.getType().equalsIgnoreCase("line"))
            {
                Line line = new Line();
                line.setType(sentobj.getType());
                line.setPositionX(sentobj.getPositionX());
                line.setPositionY(sentobj.getPositionY());
                line.setsseondpositonX( sentobj.getSecondpositionX());
                line.setsseondpositonY( sentobj.getSecondpositionY());
                line.setColor(sentobj.getColor());
                line.setId( sentobj.getId());

                return line;
            }
        }

        return null;
    }
}
