package com.tw.design_parttern.state;

public interface State {

    String getDescription();

    void wakeUp();

    void work();

    void sleep();
}
