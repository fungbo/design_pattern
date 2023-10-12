package com.tw.design_parttern.command;

import java.util.ArrayList;
import java.util.List;

public class AthletePool {

    private final List<Command> commands = new ArrayList<>();

    public void addCommands(List<Command> commands) {
        this.commands.addAll(commands);
    }

    public void executeCommands() {
        commands.forEach(Command::execute);
    }
}
