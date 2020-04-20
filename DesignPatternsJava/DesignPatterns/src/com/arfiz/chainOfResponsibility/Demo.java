package com.arfiz.chainOfResponsibility;

import com.arfiz.SOLIDDesignPriciple.singleResponsibilityPriciple.Journal;

public class Demo {
    public static void main(String[] args) {
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var autheticator = new Authenticator(logger);

        var server = new WebServer(autheticator);
        server.handle(new HttpRequest("admin", "1234"));
    }
}
