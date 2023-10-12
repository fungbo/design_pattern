package com.tw.design_parttern.decorator;

public class FurnitureHouse implements House {

    private final House house;

    public FurnitureHouse(House house) {
        this.house = house;
    }

    @Override
    public String getDescription() {
        return house.getDescription() + " with furniture";
    }

    @Override
    public double getCost() {
        return house.getCost() + 20;
    }
}
