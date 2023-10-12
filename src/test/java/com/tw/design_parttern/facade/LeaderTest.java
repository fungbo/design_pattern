package com.tw.design_parttern.facade;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LeaderTest {

    @Test
    void should_do_everything_perfectly() {
        Writer writer = mock(Writer.class);
        Reviewer reviewer = mock(Reviewer.class);
        Press press = mock(Press.class);
        Jury jury = mock(Jury.class);
        Leader leader = new Leader(writer, reviewer, press, jury);

        leader.postArticle();

        verify(writer).write();
        verify(reviewer).review();
        verify(press).publish();
        verify(jury).judge();
    }
}
