package com.arfiz.nullObject;

public class JmsRouter implements IRouter {
    @Override
    public void route(String msg) {
        System.out.println("This is from JmsRouter");
    }
}
