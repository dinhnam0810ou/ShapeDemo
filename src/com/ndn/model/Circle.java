package com.ndn.model;

import com.ndn.converter.UnitConverter;

public class Circle extends Shape {
    private double radius;
    public static final String name = "Circle";
    
    public Circle(Unit inputType, double radius) {
        super(inputType);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {      
        try {
            return Math.PI * Math.pow(UnitConverter.convertToCm(inputType, this.radius), 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return 0;      
    }

    @Override
    public String showInformation() {
        return "Circle has R = " + this.radius + " and input type is " + this.getInputType();
    }

    @Override
    public String getShapeName() {
        return Circle.name;
    }
    
    
}
