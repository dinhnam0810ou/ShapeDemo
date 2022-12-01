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

    public static final Map<Unit, IMetricSystemConverter> UNIT_CONVERTER_REVERSE = new HashMap<>();

    static {
        UNIT_CONVERTER_REVERSE.put(Unit.inch, new CmToInchConverter());
        UNIT_CONVERTER_REVERSE.put(Unit.dm, new CmToDmConverter());
    }

    public static double convertToCm(Unit unit, double value) throws Exception {
        if (unit == null) throw new Exception("The unit can not empty");
        if (unit == Unit.cm) return value;
        IMetricSystemConverter unitConverter = UNIT_CONVERTER.get(unit);
        if (unitConverter == null) throw new Exception("The unit has not a convert method");
        return unitConverter.handle(value);
    }

    public static double cmConvertToUnit(Unit unit, double value) throws Exception {
        if (unit == null) throw new Exception("The unit can not empty");
        if (unit == Unit.cm) return value;
        IMetricSystemConverter unitConverter = UNIT_CONVERTER_REVERSE.get(unit);
        if (unitConverter == null) throw new Exception("The unit has not a convert method");
        return unitConverter.handle(value);
    }
}
