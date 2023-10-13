package com.tw.design_parttern.iterator;

import java.util.ArrayList;
import java.util.List;

public class UglyContainerInverseIterator implements Iterator<String> {

    private final List<String> items = new ArrayList<>();

    private int position;

    public UglyContainerInverseIterator(List<String> items) {
        this.items.addAll(items);
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return !items.isEmpty() && position <= items.size() - 1;
    }

    @Override
    public String next() {
        if (position < 0 || position > items.size() - 1) {
            throw new IndexOutOfBoundsException();
        }

        String fruit = items.get(Math.abs(position - items.size() + 1));
        position += 1;

        return fruit;
    }
}
