package com.tw.design_parttern.command;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AthletePoolTest {

    @Test
    void should_execute_commands() {
        AthletePool pool = new AthletePool();
        Command swimCommand = mock(SwimCommand.class);
        Command runCommand = mock(RunCommand.class);

        pool.addCommands(List.of(swimCommand, runCommand));
        pool.executeCommands();

        verify(swimCommand).execute();
        verify(runCommand).execute();
    }
}
