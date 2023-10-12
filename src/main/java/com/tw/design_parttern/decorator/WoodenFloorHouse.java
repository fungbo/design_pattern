package com.tw.design_parttern.decorator;

public class WoodenFloorHouse implements House {

    private final House house;

    public WoodenFloorHouse(House house) {
        this.house = house;
    }

    @Override
    public String getDescription() {
        return house.getDescription() + " with wooden floor";
    }

    @Override
    public double getCost() {
        return house.getCost() + 10;
    }
}
