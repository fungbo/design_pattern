package com.tw.design_parttern.composite;

public abstract class FileDescriptor {

    public void cd() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        return "";
    }

    public int add(FileDescriptor file) {
        throw new UnsupportedOperationException();
    }
}
