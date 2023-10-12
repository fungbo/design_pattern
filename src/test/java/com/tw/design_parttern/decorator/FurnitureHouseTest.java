package com.tw.design_parttern.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FurnitureHouseTest {

    @Test
    void should_get_description_when_decorate_raw_house() {
        House rawHouse = new RawHouse();
        House furnitureHouse = new FurnitureHouse(rawHouse);

        String description = furnitureHouse.getDescription();

        assertEquals("This is a raw house with furniture", description);
    }

    @Test
    void should_get_cost_when_decorate_raw_house() {
        House rawHouse = new RawHouse();
        House furnitureHouse = new FurnitureHouse(rawHouse);

        double cost = furnitureHouse.getCost();

        assertEquals(120, cost);
    }

    @Test
    void should_get_description_when_decorate_wooden_floor_house() {
        House woodenFloorHouse = new WoodenFloorHouse(new RawHouse());
        House furnitureHouse = new FurnitureHouse(woodenFloorHouse);

        String description = furnitureHouse.getDescription();

        assertEquals("This is a raw house with wooden floor with furniture", description);
    }

    @Test
    void should_get_cost_when_decorate_wooden_floor_house() {
        House woodenFloorHouse = new WoodenFloorHouse(new RawHouse());
        House furnitureHouse = new FurnitureHouse(woodenFloorHouse);

        double cost = furnitureHouse.getCost();

        assertEquals(130, cost);
    }
}
