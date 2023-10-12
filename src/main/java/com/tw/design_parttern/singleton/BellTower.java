package com.tw.design_parttern.singleton;

public class BellTower {

    private static volatile BellTower instance;

    private BellTower() {
    }

    public synchronized static BellTower getInstance() {
        if (instance == null) {
            synchronized (BellTower.class) {
                if (instance == null) {
                    instance = new BellTower();
                }
            }
        }

        return instance;
    }
}
