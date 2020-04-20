package com.codewithmosh.visitor;

public class Reverb implements AudioFilter {
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Reverb - Fact Segment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Reverb - Format Segment");
    }
}
