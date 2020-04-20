package com.codewithmosh.visitor;

public class NoiseReduction implements AudioFilter {

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("NoiseReduction - Fact Segment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("NoiseReduction - Format Segment");
    }
}
