package com.arfiz.facade;

public class Demo {
    public static void main(String[] args) {
        var service = new NotificationService();
        service.send("Hello world", "target");
    }
}
