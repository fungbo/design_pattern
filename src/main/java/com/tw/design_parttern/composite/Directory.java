package com.tw.design_parttern.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileDescriptor {

    List<FileDescriptor> files = new ArrayList<>();

    @Override
    public void cd() {

    }

    @Override
    public String getDescription() {
        return "Directory";
    }

    @Override
    public int add(FileDescriptor file) {
        files.add(file);
        return files.size();
    }
}
