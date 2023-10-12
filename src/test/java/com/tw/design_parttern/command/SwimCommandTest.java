package com.tw.design_parttern.command;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SwimCommandTest {

    @Test
    void should_delegate_to_swimmer() {
        Swimmer swimmer = mock(Swimmer.class);
        SwimCommand command = new SwimCommand(swimmer);

        command.execute();

        verify(swimmer).swim();
    }
}
