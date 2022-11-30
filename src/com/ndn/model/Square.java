package com.ndn.model;

import com.ndn.converter.UnitConverter;

public class Square extends Shape {
    private double edge;
    public static final String name = "Square";
    
    public Square(Unit inputType, double edge) {
        super(inputType);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        try {
            return Math.pow(UnitConverter.convertToCm(inputType, edge), 2);
        } catch (Exception e) {
        }
        return Math.pow(edge, 2);
    }

    @Override
    public String showInformation() {
        return "Square has edge = " + this.edge + " and input type is " + this.getInputType();
    }

    @Override
    public String getShapeName() {
        return Square.name;
    }
     
}
