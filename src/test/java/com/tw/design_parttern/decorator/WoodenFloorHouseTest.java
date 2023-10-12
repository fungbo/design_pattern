package com.tw.design_parttern.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WoodenFloorHouseTest {

    @Test
    void should_get_description_when_decorate_raw_house() {
        House rawHouse = new RawHouse();
        House woodenFloorHouse = new WoodenFloorHouse(rawHouse);

        String description = woodenFloorHouse.getDescription();

        assertEquals("This is a raw house with wooden floor", description);
    }

    @Test
    void should_get_cost_when_decorate_raw_house() {
        House rawHouse = new RawHouse();
        House woodenFloorHouse = new WoodenFloorHouse(rawHouse);

        double cost = woodenFloorHouse.getCost();

        assertEquals(110, cost);
    }
}
