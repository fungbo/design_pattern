package com.tw.design_parttern.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RawHouseTest {

    @Test
    void should_get_description() {
        House house = new RawHouse();

        String description = house.getDescription();

        assertEquals("This is a raw house", description);
    }

    @Test
    void should_get_cost() {
        House house = new RawHouse();

        double cost = house.getCost();

        assertEquals(100, cost);
    }
}
