package com.tw.design_parttern.adapter;

//Adapter一般用被调用者命名
public class SingerAdapter implements Speaker {

    private final Singer singer;

    public SingerAdapter(Singer singer) {
        this.singer = singer;
    }

    @Override
    public void speak() {
        singer.sing();
    }
}
