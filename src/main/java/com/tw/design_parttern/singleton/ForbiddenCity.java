package com.tw.design_parttern.singleton;

public class ForbiddenCity {

    private static ForbiddenCity instance;

    private ForbiddenCity() {
    }

    public synchronized static ForbiddenCity getInstance() {
        if (instance == null) {
            instance = new ForbiddenCity();
        }

        return instance;
    }
}
