package com.tw.design_parttern.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SedanFactoryTest {

    @Test
    void should_get_gasoline_truck_by_type() {
        VehicleFactory factory = new SedanFactory();
        Vehicle truck = factory.makeVehicle(VehicleType.ELECTRICAL);

        String description = truck.getDescription();

        assertEquals("This is electrical sedan.", description);
    }
}
