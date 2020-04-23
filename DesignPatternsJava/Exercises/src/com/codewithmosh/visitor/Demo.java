package com.codewithmosh.visitor;

public class Demo {
    public static void main(String[] args) {
        var wavFile = WavFile.read("new.wav");
        wavFile.apply(new NoiseReduction());
    }
}
