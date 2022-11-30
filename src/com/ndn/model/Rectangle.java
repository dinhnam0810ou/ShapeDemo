package com.ndn.model;

import com.ndn.converter.UnitConverter;

public class Rectangle extends Shape{
    protected double length;
    protected double width;
    public static final String name = "Rectangle";
    
    public Rectangle(Unit inputType, double length, double width) {
        super(inputType);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        try {
            return UnitConverter.convertToCm(inputType, length) * UnitConverter.convertToCm(inputType, length);
        } catch (Exception e) {
        }
        return this.length * this.width;
    }

    @Override
    public String showInformation() {
        return "Rectangle has length = " + this.length + " and width = " + this.width + " and input type is " + this.getInputType();
    }

    @Override
    public String getShapeName() {
        return Rectangle.name;
    }
    
    
}
