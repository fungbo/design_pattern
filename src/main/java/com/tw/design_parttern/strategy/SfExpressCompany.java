package com.tw.design_parttern.strategy;

public class SfExpressCompany implements ExpressCompany {

    @Override
    public DeliveryManifest delivery(Goods goods) {
        return new DeliveryManifest("SF", 150);
    }
}
