package com.tw.design_parttern.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FileTest {

    @Test
    void should_throw_exception_when_cd_a_file() {
        FileDescriptor file = new File();

        assertThrows(UnsupportedOperationException.class, file::cd);
    }

    @Test
    void should_get_description_of_file() {
        FileDescriptor file = new File();

        String description = file.getDescription();

        assertEquals("File", description);
    }

    @Test
    void should_throw_exception_when_add_file_to_a_file() {
        FileDescriptor file = new File();
        FileDescriptor anotherFile = new File();

        assertThrows(UnsupportedOperationException.class, () -> file.add(anotherFile));
    }
}
