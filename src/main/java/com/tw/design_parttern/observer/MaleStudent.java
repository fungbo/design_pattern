package com.tw.design_parttern.observer;

public class MaleStudent extends Student {

    public MaleStudent(FeelingReceiver feelingReceiver) {
        super(feelingReceiver);
    }

    @Override
    public void doHomework(String homework) {
        feelingReceiver.receiveFeeling("Fuck, " + homework);
    }
}
