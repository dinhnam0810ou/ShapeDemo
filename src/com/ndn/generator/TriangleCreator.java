package com.ndn.generator;

import java.util.Random;

import com.ndn.model.Triangle;
import com.ndn.model.Unit;

public class TriangleCreator implements ShapeCreator<Triangle>{
    public static final String name = "TriangleCreator";
    @Override
    public Triangle create(Unit inputType) {
        Random rand = new Random();
        return new Triangle(inputType, rand.nextDouble(), rand.nextDouble());
    }


}
