package com.arfiz.nullObject;

public class SmsRouter implements IRouter{
    @Override
    public void route(String msg) {
        System.out.println("This is from SmsRouter");
    }
}
