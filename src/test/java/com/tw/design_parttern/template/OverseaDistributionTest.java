package com.tw.design_parttern.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OverseaDistributionTest {

    @Test
    void should_delivery_goods_to_oversea() {
        Distribution distribution = new OverseaDistribution();

        double cost = distribution.deliveryGoodsCost();

        assertEquals(550.0, cost, 0.01);
    }
}
