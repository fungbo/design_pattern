package com.tw.design_parttern.state;

public class SleepState implements State {

    private final Person person;

    public SleepState(Person person) {
        this.person = person;
    }

    @Override
    public String getDescription() {
        return "sleep";
    }

    @Override
    public void wakeUp() {
        person.setState(person.getWakeUpState());
    }

    @Override
    public void work() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sleep() {
        throw new UnsupportedOperationException();
    }
}
