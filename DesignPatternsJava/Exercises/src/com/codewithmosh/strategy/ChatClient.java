package com.codewithmosh.strategy;

public class ChatClient {
    private EncryptionAlgorithm encryptionAlgorithm;

    public ChatClient(EncryptionAlgorithm encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        var encryptedMessage = encryptionAlgorithm.encrypt(message);
        System.out.println("Sending encrypted message");
    }
}
