package com.ndn.generator;

import java.util.Random;

import com.ndn.model.Square;
import com.ndn.model.Unit;

public class SquareCreator implements ShapeCreator<Square>{
    public static final String name = "SquareCreator";

    @Override
    public Square create(Unit inputType) {
        Random rand = new Random();
        return new Square(inputType, 1 + rand.nextDouble() * (19));
    }


}
