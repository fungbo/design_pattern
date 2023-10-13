package com.tw.design_parttern.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonTest {

    @Test
    void should_switch_to_wakeup_state_from_sleep_state() {
        Person person = new Person();
        State sleepState = new SleepState(person);
        person.setState(sleepState);

        person.wakeUp();

        assertEquals("wakeup", person.getStateDescription());
    }

    @Test
    void should_switch_to_work_state_from_wakeup_state() {
        Person person = new Person();
        State wakeUpState = new WakeUpState(person);
        person.setState(wakeUpState);

        person.work();

        assertEquals("work", person.getStateDescription());
    }

    @Test
    void should_switch_to_sleep_state_from_work_state() {
        Person person = new Person();
        State workState = new WorkState(person);
        person.setState(workState);

        person.sleep();

        assertEquals("sleep", person.getStateDescription());
    }

    @Test
    void should_throw_exception_when_sleep_to_work() {
        Person person = new Person();
        State sleepState = new SleepState(person);
        person.setState(sleepState);

        assertThrows(UnsupportedOperationException.class, person::work);
    }

    @Test
    void should_throw_exception_when_work_to_wakeup() {
        Person person = new Person();
        State workState = new WorkState(person);
        person.setState(workState);

        assertThrows(UnsupportedOperationException.class, person::wakeUp);
    }

    @Test
    void should_throw_exception_when_wakeup_to_wakeup() {
        Person person = new Person();
        State wakeUpState = new WakeUpState(person);
        person.setState(wakeUpState);

        assertThrows(UnsupportedOperationException.class, person::wakeUp);
    }
}
