package com.tw.design_parttern.factory;

public interface City {

    void makeVehicleFactory(VehicleFactory vehicleFactory);

    Vehicle exhibitVehicle(VehicleType vehicleType);
}
