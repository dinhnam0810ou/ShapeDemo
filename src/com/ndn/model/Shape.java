package com.ndn.model;

public abstract class Shape {
    
    protected Unit inputType = Unit.cm;

    public Shape(Unit inputType) {
        this.inputType = inputType;
    }

    public Unit getInputType() {
        return inputType;
    }

    public void setInputType(Unit inputType) {
        this.inputType = inputType;
    }
    
    public abstract double getArea();
    public abstract String showInformation();
    public abstract String getShapeName();
}
