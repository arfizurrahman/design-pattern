package com.codewithmosh;

import com.codewithmosh.facade.TwitterAPI;

public class Main {
    public static void main(String[] args) {
        var api = new TwitterAPI("apiKey", "secret");
        api.getRecentTweets();
    }
}
