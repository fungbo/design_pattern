package com.tw.design_parttern.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectoryTest {

    @Test
    void should_not_throw_exception_when_cd_a_directory() {
        FileDescriptor directory = new Directory();

        assertDoesNotThrow(directory::cd);
    }

    @Test
    void should_get_description_of_directory() {
        FileDescriptor directory = new Directory();

        String description = directory.getDescription();

        assertEquals("Directory", description);
    }

    @Test
    void should_add_file_in_directory() {
        FileDescriptor directory = new Directory();
        FileDescriptor file = new File();

        int size = directory.add(file);

        assertEquals(1, size);
    }
}
