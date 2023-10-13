package com.tw.design_parttern.state;

public class Person {

    private final SleepState sleepState;
    private final WakeUpState wakeUpState;
    private State workState;

    private State state;

    public Person() {
        this.sleepState = new SleepState(this);
        this.wakeUpState = new WakeUpState(this);
        this.workState = new WorkState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void wakeUp() {
        state.wakeUp();
    }

    public void work() {
        state.work();
    }

    public void sleep() {
        state.sleep();
    }

    public String getStateDescription() {
        return state.getDescription();
    }

    public State getWakeUpState() {
        return wakeUpState;
    }

    public State getWorkState() {
        return workState;
    }

    public State getSleepState() {
        return sleepState;
    }
}
