package com.tw.design_parttern.state;

public class WakeUpState implements State {

    private final Person person;

    public WakeUpState(Person person) {
        this.person = person;
    }

    @Override
    public String getDescription() {
        return "wakeup";
    }

    @Override
    public void wakeUp() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void work() {
        person.setState(person.getWorkState());
    }

    @Override
    public void sleep() {
        person.setState(person.getSleepState());
    }
}
