package com.ndn.generator;

import com.ndn.model.Unit;

public interface ShapeCreator<T> {
    
    T create(Unit inputType);
    
}
