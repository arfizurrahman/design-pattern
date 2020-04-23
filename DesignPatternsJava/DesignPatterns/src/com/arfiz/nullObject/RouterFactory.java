package com.arfiz.nullObject;

public class RouterFactory {
    public static IRouter getRouterForMessage(String msg){
        if (msg.equals("sms"))
            return new SmsRouter();
        else if (msg.equals("jms"))
            return new JmsRouter();
        else
            return new NullRouter();
    }
}
