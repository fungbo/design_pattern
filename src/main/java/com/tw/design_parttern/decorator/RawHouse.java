package com.tw.design_parttern.decorator;

public class RawHouse implements House {

    @Override
    public String getDescription() {
        return "This is a raw house";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
