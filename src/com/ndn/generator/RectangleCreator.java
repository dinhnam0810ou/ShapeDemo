package com.ndn.generator;

import java.util.Random;

import com.ndn.model.Rectangle;
import com.ndn.model.Unit;

public class RectangleCreator implements ShapeCreator<Rectangle>{
    public static final String name = "RectangleCreator";
    @Override
    public Rectangle create(Unit inputType) {
        Random rand = new Random();
        return new Rectangle(inputType, rand.nextDouble(), rand.nextDouble());
    }


}
