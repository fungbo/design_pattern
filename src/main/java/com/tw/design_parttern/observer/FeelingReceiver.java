package com.tw.design_parttern.observer;

import java.util.List;

public interface FeelingReceiver {

    void receiveFeeling(String feeling);

    List<String> getFeelings();
}
