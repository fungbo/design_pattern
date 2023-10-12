package com.tw.design_parttern.command;

import javax.sql.CommonDataSource;

public class Athlete {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void go() {
        command.execute();
    }
}
