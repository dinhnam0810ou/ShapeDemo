package com.ndn.converter;

public class DmToCmConverter implements IMetricSystemConverter{

    @Override
    public double handle(double value) {
        return 10 * value;
    }

}
