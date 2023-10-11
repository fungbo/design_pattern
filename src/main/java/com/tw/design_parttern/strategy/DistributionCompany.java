package com.tw.design_parttern.strategy;

public interface DistributionCompany {

    DeliveryManifest delivery(Goods goods);
}
