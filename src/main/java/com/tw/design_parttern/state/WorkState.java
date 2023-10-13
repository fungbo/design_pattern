package com.tw.design_parttern.state;

public class WorkState implements State {

    private final Person person;

    public WorkState(Person person) {
        this.person = person;
    }

    @Override
    public String getDescription() {
        return "work";
    }

    @Override
    public void wakeUp() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void work() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sleep() {
        person.setState(person.getSleepState());
    }
}
