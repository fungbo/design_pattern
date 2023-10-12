package com.tw.design_parttern.command;

public class SwimCommand implements Command {

    private final Swimmer swimmer;

    public SwimCommand(Swimmer swimmer) {
        this.swimmer = swimmer;
    }

    @Override
    public void execute() {
        swimmer.swim();
    }
}
