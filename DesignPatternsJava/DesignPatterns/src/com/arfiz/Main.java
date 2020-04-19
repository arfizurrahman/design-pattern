package com.arfiz;

import com.arfiz.strategy.BlackAndWhiteFilter;
import com.arfiz.strategy.ImageStorage;
import com.arfiz.strategy.JpegCompressor;
import com.arfiz.strategy.PngCompressor;

public class Main {

    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a", new PngCompressor(), new BlackAndWhiteFilter());
    }
}
