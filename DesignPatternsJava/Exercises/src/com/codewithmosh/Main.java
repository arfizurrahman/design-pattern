package com.codewithmosh;

import com.codewithmosh.adapter.EmailClient;
import com.codewithmosh.adapter.GmailAdapter;

public class Main {
    public static void main(String[] args) {
        var client = new EmailClient();
        client.addProvider(new GmailAdapter());
        client.downloadEmails();
    }
}
