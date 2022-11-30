package com.ndn.model;

import com.ndn.converter.UnitConverter;

public class Triangle extends Shape{
    private double bottomEdge, height;
    public static final String name = "Triangle";
    
    public Triangle(Unit inputType, double bottomEdge, double height) {
        super(inputType);
        this.bottomEdge = bottomEdge;
        this.height = height;
    }

    public double getBottomEdge() {
        return bottomEdge;
    }

    public void setBottomEdge(double bottomEdge) {
        this.bottomEdge = bottomEdge;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        try {
            return (UnitConverter.convertToCm(inputType, this.bottomEdge)/2) * UnitConverter.convertToCm(inputType, this.height);
        } catch (Exception e) {
        }
        return (this.bottomEdge/2) * this.height;
    }

    @Override
    public String showInformation() {
        return "Triangle has bottom edge = " + this.bottomEdge + " and height = " + this.height + " and input type is " + this.getInputType();
    }

    @Override
    public String getShapeName() {
        return Triangle.name;
    }
       
}
