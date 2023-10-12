package com.tw.design_parttern.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SmallCityTest {

    @Test
    void should_make_electrical_sedan_in_small_city() {
        City city = new SmallCity();
        VehicleFactory vehicleFactory = new SedanFactory();
        city.makeVehicleFactory(vehicleFactory);

        Vehicle vehicle = city.exhibitVehicle(VehicleType.ELECTRICAL);

        assertEquals("This is electrical sedan.", vehicle.getDescription());
    }

    @Test
    void should_throw_exception_when_gas_sedan_is_exhibited() {
        City city = new SmallCity();
        VehicleFactory vehicleFactory = new SedanFactory();

        city.makeVehicleFactory(vehicleFactory);

        assertThrows(IllegalArgumentException.class, () -> city.exhibitVehicle(VehicleType.GASOLINE));
    }
}
