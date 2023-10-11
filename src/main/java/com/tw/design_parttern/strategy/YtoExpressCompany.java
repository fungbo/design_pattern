package com.tw.design_parttern.strategy;

public class YtoExpressCompany implements ExpressCompany {

    @Override
    public DeliveryManifest delivery(Goods goods) {
        return new DeliveryManifest("YTO", 130.5);
    }
}
