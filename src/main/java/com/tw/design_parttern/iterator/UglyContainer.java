package com.tw.design_parttern.iterator;

import java.util.ArrayList;
import java.util.List;

public class UglyContainer {

    private final List<String> items = new ArrayList<>();

    public UglyContainer(List<String> items) {
        this.items.addAll(items);
    }

    public Iterator<String> iterator() {
        return new UglyContainerInverseIterator(items);
    }
}
