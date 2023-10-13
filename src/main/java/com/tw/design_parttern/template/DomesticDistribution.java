package com.tw.design_parttern.template;

public class DomesticDistribution extends Distribution {

    @Override
    protected double deliveryRate() {
        return 1.1;
    }
}
