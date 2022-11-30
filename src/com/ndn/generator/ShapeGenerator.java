package com.ndn.generator;

import java.util.HashMap;
import java.util.Map;

import com.ndn.model.Circle;
import com.ndn.model.Rectangle;
import com.ndn.model.Shape;
import com.ndn.model.Square;
import com.ndn.model.Triangle;
import com.ndn.model.Unit;

public class ShapeGenerator {
    public static final Map<Class, ShapeCreator> SHAPE_GENERATOR = new HashMap<>();
    static {
        SHAPE_GENERATOR.put(Circle.class, new CircleCreator());
        SHAPE_GENERATOR.put(Triangle.class, new TriangleCreator());
        SHAPE_GENERATOR.put(Square.class, new SquareCreator());
        SHAPE_GENERATOR.put(Rectangle.class, new RectangleCreator());
    }
    
    public static <T extends Shape> T createNewShape(Class<T> clazz, Unit unit) {
        return (T) SHAPE_GENERATOR.get(clazz).create(unit);
    }
}
