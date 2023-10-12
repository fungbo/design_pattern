package com.tw.design_parttern.command;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AthleteTest {

    @Test
    void should_execute_command() {
        Athlete athlete = new Athlete();
        SwimCommand command = mock(SwimCommand.class);
        athlete.setCommand(command);
        athlete.go();

        verify(command).execute();
    }
}
