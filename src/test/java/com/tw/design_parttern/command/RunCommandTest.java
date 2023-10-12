package com.tw.design_parttern.command;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RunCommandTest {

    @Test
    void should_delegate_to_runner() {
        Runner runner = mock(Runner.class);
        RunCommand command = new RunCommand(runner);

        command.execute();

        verify(runner).run();
    }
}
