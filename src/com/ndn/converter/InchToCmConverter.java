package com.ndn.converter;

public class InchToCmConverter implements IMetricSystemConverter{

    @Override
    public double handle(double value) {
        return 2.54 * value;
    }

}
