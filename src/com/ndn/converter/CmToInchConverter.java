package com.ndn.converter;

public class CmToInchConverter implements IMetricSystemConverter{

    @Override
    public double handle(double value) {
        return value / 2.54;
    }

}
