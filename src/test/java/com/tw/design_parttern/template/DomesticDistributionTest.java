package com.tw.design_parttern.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DomesticDistributionTest {

    @Test
    void should_delivery_goods_to_domestic() {
        Distribution distribution = new DomesticDistribution();

        double cost = distribution.deliveryGoodsCost();

        assertEquals(110.0, cost, 0.01);
    }
}
