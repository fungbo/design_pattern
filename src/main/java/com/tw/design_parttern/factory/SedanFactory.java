package com.tw.design_parttern.factory;

public class SedanFactory implements VehicleFactory {

    @Override
    public Vehicle makeVehicle(VehicleType vehicleType) {
        if (vehicleType != VehicleType.ELECTRICAL) {
            throw new IllegalArgumentException("Only electrical sedan is supported.");
        }

        return new ElectricalSedan();
    }
}
