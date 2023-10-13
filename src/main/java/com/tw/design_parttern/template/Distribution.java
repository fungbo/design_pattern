package com.tw.design_parttern.template;

public abstract class Distribution {

    public double deliveryGoodsCost() {
        return baseCost() * deliveryRate();
    }

    private double baseCost() {
        return 100;
    }

    protected abstract double deliveryRate();

}
