package com.codewithmosh.facade;

import java.util.List;

public class TwitterAPI {
    private String apiKey;
    private String secret;

    public TwitterAPI(String apiKey, String appSecret) {
        this.apiKey = apiKey;
        this.secret = appSecret;
    }

    public List<Tweet> getRecentTweets(){

        var twitterClient = new TwitterClient();
        var tweets = twitterClient.getRecentTweets(getAccessToken());

        return tweets;
    }

    private String getAccessToken(){
        var oauth = new OAuth();
        var requestToken = oauth.requestToken(apiKey, secret);
        var accessToken = oauth.getAccessToken(requestToken);

        return accessToken;
    }
}
