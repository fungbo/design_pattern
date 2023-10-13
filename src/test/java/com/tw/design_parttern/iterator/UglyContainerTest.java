package com.tw.design_parttern.iterator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UglyContainerTest {

    @Test
    void should_iterate_every_item_with_iterator() {
        UglyContainer container = new UglyContainer(List.of("Apple", "Banana", "Orange", "Watermelon"));

        Iterator<String> iterator = container.iterator();

        String next = iterator.next();
        assertEquals("Watermelon", next);

        next = iterator.next();
        assertEquals("Orange", next);

        next = iterator.next();
        assertEquals("Banana", next);

        next = iterator.next();
        assertEquals("Apple", next);
    }
}
