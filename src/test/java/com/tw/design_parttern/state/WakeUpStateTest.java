package com.tw.design_parttern.state;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WakeUpStateTest {

    @Test
    void should_switch_to_sleep_state() {
        Person person = mock(Person.class);
        State wakeUpState = new WakeUpState(person);

        wakeUpState.sleep();

        verify(person).setState(person.getSleepState());
    }
}
