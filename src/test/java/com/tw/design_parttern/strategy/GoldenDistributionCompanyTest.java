package com.tw.design_parttern.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoldenDistributionCompanyTest {
    @Test
    void should_get_delivery_manifest_when_delivery_goods_with_sf() {
        ExpressCompany sfExpress = new SfExpressCompany();
        DistributionCompany goldenDistribution = new GoldenDistributionCompany(sfExpress);

        DeliveryManifest manifest = goldenDistribution.delivery(new Goods());

        assertEquals("Golden-SF", manifest.company());
        assertEquals(200, manifest.cost());
    }

    @Test
    void should_get_delivery_manifest_when_delivery_goods_with_yto() {
        ExpressCompany ytoExpress = new YtoExpressCompany();
        DistributionCompany goldenDistribution = new GoldenDistributionCompany(ytoExpress);

        DeliveryManifest manifest = goldenDistribution.delivery(new Goods());

        assertEquals("Golden-YTO", manifest.company());
        assertEquals(180.5, manifest.cost());
    }
}
