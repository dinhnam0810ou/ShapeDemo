package com.ndn.generator;

import java.util.Random;

import com.ndn.model.Circle;
import com.ndn.model.Unit;

public class CircleCreator implements ShapeCreator<Circle> {
    
    public static final String name = "CircleCreator";
    
    @Override
    public Circle create(Unit inputType) {
        Random rand = new Random();
        return new Circle(inputType, 1 + rand.nextDouble() * (19));
    }

}
