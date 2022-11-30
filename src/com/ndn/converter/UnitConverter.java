package com.ndn.converter;

import java.util.HashMap;
import java.util.Map;

import com.ndn.model.Unit;

public class UnitConverter {
    
    public static final Map<Unit, IMetricSystemConverter> UNIT_CONVERTER = new HashMap<>();
    
    static {
        UNIT_CONVERTER.put(Unit.inch, new InchToCmConverter());
        UNIT_CONVERTER.put(Unit.dm, new DmToCmConverter());
    }
    
    public static double convertToCm(Unit unit, double value) {
        return UNIT_CONVERTER.get(unit).handle(value);
    }
}
