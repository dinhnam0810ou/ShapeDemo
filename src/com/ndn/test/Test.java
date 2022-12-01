package com.ndn.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.ndn.converter.UnitConverter;
import com.ndn.generator.ShapeGenerator;
import com.ndn.model.Circle;
import com.ndn.model.Rectangle;
import com.ndn.model.Shape;
import com.ndn.model.Square;
import com.ndn.model.Triangle;
import com.ndn.model.Unit;

public class Test {
    public static void main(String[] args) throws Exception {
        
        System.out.println("========= Test Exercise 1 =========");
        Circle c1 = new Circle(Unit.dm, 10);
        Rectangle r1 = new Rectangle(Unit.mm, 20, 10);
        Square s1 = new Square(Unit.cm, 5);
        Triangle t1 = new Triangle(Unit.cm, 20, 7.9);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(c1);
        shapes.add(r1);
        shapes.add(s1);
        shapes.add(t1);
        
        Map<String, Integer> locationRequest = new HashMap<>();
        locationRequest.put(Circle.name, 3);
        locationRequest.put(Triangle.name, 1);
        locationRequest.put(Rectangle.name, 4);
        locationRequest.put(Square.name, 2);
        
        Collections.sort(shapes, new Comparator<Shape>() {

            @Override
            public int compare(Shape s1, Shape s2) {
                return locationRequest.get(s1.getShapeName()) - locationRequest.get(s2.getShapeName());
            }
        });
        
        System.out.println("List after sort");
        for (Shape s : shapes) {
            System.out.println(s.showInformation());
        }
                
        
        System.out.println("========= Test Exercise 2 =========");
        System.out.println(r1.showInformation());
        System.out.println(r1.getArea() + " cm^2");
        
        System.out.println("========= Test Exercise 3 =========");
        
        shapes.add(ShapeGenerator.createNewShape(Circle.class, Unit.inch));
        shapes.add(ShapeGenerator.createNewShape(Square.class, Unit.dm));
        shapes.add(ShapeGenerator.createNewShape(Triangle.class, Unit.cm));
        shapes.add(ShapeGenerator.createNewShape(Rectangle.class, Unit.inch));
        
        for (Shape s : shapes) {
            System.out.println(s.showInformation());
        }
        
        double sum = 0;
        
        for (Shape s : shapes) {
           sum += s.getArea();
        }
        System.out.println("Total area is " + sum + " cm^2");
        
        
    }
}
