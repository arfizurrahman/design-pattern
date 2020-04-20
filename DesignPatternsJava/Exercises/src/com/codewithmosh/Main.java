package com.codewithmosh;

import com.codewithmosh.chainOfResponsibility.*;
import com.codewithmosh.visitor.NoiseReduction;
import com.codewithmosh.visitor.WavFile;

public class Main {
    public static void main(String[] args) {
        var wavFile = WavFile.read("new.wav");
        wavFile.apply(new NoiseReduction());
    }
}
