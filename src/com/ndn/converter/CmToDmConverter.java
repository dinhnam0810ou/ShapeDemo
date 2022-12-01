package com.ndn.converter;

public class CmToDmConverter implements IMetricSystemConverter{

    @Override
    public double handle(double value) {
        return value / 10;
    }

}
