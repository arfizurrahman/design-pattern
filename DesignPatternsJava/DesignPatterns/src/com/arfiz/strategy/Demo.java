package com.arfiz.strategy;

public class Demo {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a", new PngCompressor(), new BlackAndWhiteFilter());
    }
}
