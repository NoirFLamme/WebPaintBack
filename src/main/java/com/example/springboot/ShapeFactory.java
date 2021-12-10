package com.example.springboot;

import org.springframework.web.bind.annotation.RequestParam;

public class ShapeFactory {
    public Shape create(Object sentobject)
    {

        Shape sentobj = (Shape) sentobject;

        if (sentobj == null)
        {
            return null;
        }
        else if (sentobj.name.equalsIgnoreCase("circle"))
        {
            Circle circle = new Circle();
            sentobj = (Circle) sentobj;
            circle.name=sentobj.name;
            circle.x= ((Circle) sentobj).x;
            circle.y=((Circle) sentobj).y;
            circle.radius=((Circle) sentobj).radius;
            circle.color=sentobj.color;
            circle.isDraw=sentobj.isDraw;
            circle.isFilled=sentobj.isFilled;
            return circle;


        }
        else if (sentobj.name.equalsIgnoreCase("rectangle"))
        {
            Rectangle rect = new Rectangle();
            sentobj = (Rectangle) sentobj;
            rect.name=sentobj.name;
            rect.rX= ((Rectangle) sentobj).rX;
            rect.rY= ((Rectangle) sentobj).rY;
            rect.rWidth= ((Rectangle) sentobj).rWidth;
            rect.rHight= ((Rectangle) sentobj).rHight;
            rect.color=sentobj.color;
            rect.isDraw=sentobj.isDraw;
            rect.isFilled=sentobj.isFilled;
        }
        else if (sentobj.name.equalsIgnoreCase("triangle"))
        {
            Triangle triangle = new Triangle();
            sentobj = (Triangle) sentobj;
            triangle.name=sentobj.name;
            triangle.x1= ((Triangle) sentobj).x1;
            triangle.x2= ((Triangle) sentobj).x2;
            triangle.x3= ((Triangle) sentobj).x3;
            triangle.y1= ((Triangle) sentobj).y1;
            triangle.y2= ((Triangle) sentobj).y2;
            triangle.y3= ((Triangle) sentobj).y3;
            triangle.color=sentobj.color;
            triangle.isDraw=sentobj.isDraw;
            triangle.isFilled=sentobj.isFilled;
            return triangle;
        }
        else if (sentobj.name.equalsIgnoreCase("elipse"))
        {
            Elipse elipse = new Elipse();
            sentobj = (Elipse) sentobj;
            elipse.name=sentobj.name;
            elipse.cX= ((Elipse) sentobj).cX;
            elipse.cY= ((Elipse) sentobj).cY;
            elipse.cWidth= ((Elipse) sentobj).cWidth;
            elipse.cHight= ((Elipse) sentobj).cHight;
            elipse.color=sentobj.color;
            elipse.isDraw=sentobj.isDraw;
            elipse.isFilled=sentobj.isFilled;
            return elipse;
        }
        else if (sentobj.name.equalsIgnoreCase("line")) {
            Line line = new Line();
            sentobj = (Line) sentobj;
            line.name = sentobj.name;
            line.x1 = ((Line) sentobj).x1;
            line.x2 = ((Line) sentobj).x2;
            line.y1 = ((Line) sentobj).y1;
            line.y2 = ((Line) sentobj).y2;
            line.color = sentobj.color;
            line.isDraw = sentobj.isDraw;
            line.isFilled = sentobj.isFilled;
            return line;
        }
        return null;
    }
}
