package com.codewithmosh;

import com.codewithmosh.strategy.ChatClient;
import com.codewithmosh.strategy.DES;

public class Main {

    public static void main(String[] args) {
        var chatClient = new ChatClient(new DES());
        chatClient.send("a");
    }
}
