package com.codewithmosh.command;

public abstract class AbstractUndoableCommand implements UndoableCommand{
    private History history;
    private VideoEditor videoEditor;

    public AbstractUndoableCommand(History history, VideoEditor videoEditor) {
        this.history = history;
        this.videoEditor = videoEditor;
    }

    @Override
    public void execute() {
        doExecute();
        history.push(this);
    }

    protected abstract void doExecute();
}
