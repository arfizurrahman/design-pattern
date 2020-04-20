package com.arfiz;

import com.arfiz.chainOfResponsibility.*;

public class Main {
    public static void main(String[] args) {
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);

        var server = new WebServer(authenticator);
        server.handle(new HttpRequest("admi", "1234"));
    }
}
