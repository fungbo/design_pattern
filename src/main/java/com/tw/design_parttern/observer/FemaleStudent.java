package com.tw.design_parttern.observer;

public class FemaleStudent extends Student {


    public FemaleStudent(FeelingReceiver feelingReceiver) {
        super(feelingReceiver);
    }

    @Override
    void doHomework(String homework) {
        feelingReceiver.receiveFeeling("I love " + homework);
    }
}
