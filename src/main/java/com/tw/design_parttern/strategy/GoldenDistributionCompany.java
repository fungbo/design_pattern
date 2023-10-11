package com.tw.design_parttern.strategy;

public class GoldenDistributionCompany implements DistributionCompany {

    //变化的逻辑通过接口隔离，在运行时决定
    private final ExpressCompany expressCompany;

    public GoldenDistributionCompany(ExpressCompany expressCompany) {
        this.expressCompany = expressCompany;
    }

    @Override
    public DeliveryManifest delivery(Goods goods) {
        DeliveryManifest manifest = expressCompany.delivery(goods);

        //不变的逻辑自己类中实现
        return new DeliveryManifest("Golden-" + manifest.company(), manifest.cost() + 50);
    }
}
