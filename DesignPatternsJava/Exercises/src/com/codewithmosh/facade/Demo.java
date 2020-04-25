package com.codewithmosh.facade;

public class Demo {
    public static void show() {
        var api = new TwitterAPI("apiKey", "secret");
        api.getRecentTweets();
    }
}
