package com.tw.design_parttern.observer;

import java.util.ArrayList;
import java.util.List;

public class HumanFeelingReceiver implements FeelingReceiver {

    private final List<String> feelings = new ArrayList<>();

    @Override
    public void receiveFeeling(String feeling) {
        feelings.add(feeling);
    }

    @Override
    public List<String> getFeelings() {
        return feelings;
    }
}
