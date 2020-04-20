package com.codewithmosh.visitor;

public class Normalize implements AudioFilter {

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Normalize - Fact Segment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Normalize - Format Segment");
    }
}
