package com.tw.design_parttern.command;

public class RunCommand implements Command {

    private final Runner runner;

    public RunCommand(Runner runner) {
        this.runner = runner;
    }

    @Override
    public void execute() {
        runner.run();
    }
}
