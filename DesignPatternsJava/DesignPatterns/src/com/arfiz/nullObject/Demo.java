package com.arfiz.nullObject;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> messages = new ArrayList<>();
        messages.add("sms");
        messages.add("jms");
        messages.add("");

        handle(messages);
    }
    public static void handle(Iterable<String> messages) {
        for (var msg : messages) {
            IRouter router = RouterFactory.getRouterForMessage(msg);
            router.route(msg);
        }
    }
}
