package com.tw.design_parttern.singleton;

public class WildGoosePagoda {

    private static final WildGoosePagoda instance = new WildGoosePagoda();

    private WildGoosePagoda() {
    }

    public static WildGoosePagoda getInstance() {
        return instance;
    }
}
