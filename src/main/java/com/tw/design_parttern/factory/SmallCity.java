package com.tw.design_parttern.factory;

public class SmallCity implements City {

    private VehicleFactory vehicleFactory;

    @Override
    public void makeVehicleFactory(VehicleFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }

    @Override
    public Vehicle exhibitVehicle(VehicleType vehicleType) {
        return vehicleFactory.makeVehicle(vehicleType);
    }
}
