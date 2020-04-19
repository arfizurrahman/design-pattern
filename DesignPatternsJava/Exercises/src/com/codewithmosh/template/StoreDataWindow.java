package com.codewithmosh.template;

public class StoreDataWindow extends Window {

    @Override
    protected void doExecuteBefore() {
        System.out.println("Doing task before window closed");
    }

    @Override
    protected void doExecuteAfter() {
        System.out.println("Doing task after window closed");
    }
}
