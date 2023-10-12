package com.tw.design_parttern.adapter;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SingerAdapterTest {

    @Test
    void should_make_singer_speak() {
        Singer singer = mock(Singer.class);
        Speaker speaker = new SingerAdapter(singer);

        speaker.speak();

        verify(singer).sing();
    }
}
