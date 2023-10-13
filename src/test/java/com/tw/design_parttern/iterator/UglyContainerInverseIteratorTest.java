package com.tw.design_parttern.iterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UglyContainerInverseIteratorTest {

    @Test
    void should_return_true_when_container_is_not_empty() {
        Iterator<String> iterator = new UglyContainerInverseIterator(List.of("Apple", "Banana", "Orange"));

        boolean hasNext = iterator.hasNext();

        assertTrue(hasNext);
    }

    @Test
    void should_return_false_when_container_is_empty() {
        Iterator<String> iterator = new UglyContainerInverseIterator(List.of());

        boolean hasNext = iterator.hasNext();

        assertFalse(hasNext);
    }

    @Test
    void should_get_next_from_container() {
        Iterator<String> iterator = new UglyContainerInverseIterator(List.of("Apple", "Banana", "Orange"));

        String next = iterator.next();
        assertEquals("Orange", next);

        next = iterator.next();
        assertEquals("Banana", next);

        next = iterator.next();
        assertEquals("Apple", next);

        assertThrows(IndexOutOfBoundsException.class, iterator::next);
    }

    @Test
    void should_get_every_fruit_in_iteration() {
        Iterator<String> iterator = new UglyContainerInverseIterator(List.of("Apple", "Banana", "Orange", "Watermelon"));

        List<String> iteratorList = new ArrayList<>();
        while (iterator.hasNext()) {
            iteratorList.add(iterator.next());
        }

        assertArrayEquals(new String[]{"Watermelon", "Orange", "Banana", "Apple"}, iteratorList.toArray());
    }
}
