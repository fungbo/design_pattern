package com.tw.design_parttern.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleFactoryTest {

    @Test
    void should_get_gasoline_truck_by_type() {
        VehicleFactory factory = new TruckFactory();
        Vehicle truck = factory.makeVehicle(VehicleType.GASOLINE);

        String description = truck.getDescription();

        assertEquals("This is gasoline truck.", description);
    }

    @Test
    void should_get_electrical_truck_by_type() {
        VehicleFactory factory = new TruckFactory();
        Vehicle truck = factory.makeVehicle(VehicleType.ELECTRICAL);

        String description = truck.getDescription();

        assertEquals("This is electrical truck.", description);
    }
}
