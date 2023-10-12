package com.tw.design_parttern.facade;

public class Leader {

    private final Writer writer;
    private final Reviewer reviewer;
    private final Press press;
    private final Jury jury;

    public Leader(Writer writer, Reviewer reviewer, Press press, Jury jury) {
        this.writer = writer;
        this.reviewer = reviewer;
        this.press = press;
        this.jury = jury;
    }

    public void postArticle() {
        writer.write();
        reviewer.review();
        press.publish();
        jury.judge();
    }
}
