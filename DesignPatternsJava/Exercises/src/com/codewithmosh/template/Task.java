package com.codewithmosh.template;

public abstract class Task {
    public void execute(){
        doExecute();
    };

    protected abstract void doExecute();
}
