package com.tw.design_parttern.state;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SleepStateTest {

    @Test
    void should_switch_to_wakeup_state() {
        Person person = mock(Person.class);
        State sleepState = new SleepState(person);

        sleepState.wakeUp();

        verify(person).setState(person.getWakeUpState());
    }
}
