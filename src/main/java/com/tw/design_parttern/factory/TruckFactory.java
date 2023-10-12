package com.tw.design_parttern.factory;

public class TruckFactory implements VehicleFactory {

    @Override
    public Vehicle makeVehicle(VehicleType vehicleType) {

        return switch (vehicleType) {
            case GASOLINE -> new GasolineTruck();
            case ELECTRICAL -> new ElectricalTruck();
            default -> throw new IllegalArgumentException("Invalid vehicle type: " + vehicleType);
        };
    }
}
