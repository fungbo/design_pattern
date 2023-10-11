package com.tw.design_parttern.observer;

public abstract class Student {

    protected final FeelingReceiver feelingReceiver;

    protected Student(FeelingReceiver feelingReceiver) {
        this.feelingReceiver = feelingReceiver;
    }

    void waitingForHomework(PrimarySchool primarySchool) {
        primarySchool.enrollIn(this);
    }

    abstract void doHomework(String feeling);
}
