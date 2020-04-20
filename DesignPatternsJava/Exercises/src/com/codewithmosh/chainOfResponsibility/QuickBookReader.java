package com.codewithmosh.chainOfResponsibility;

public class QuickBookReader extends DataReader {

    @Override
    protected String getExtension() {
        return ".qbw";
    }

    @Override
    public void doRead(String fileName) {
        System.out.println("Reading using quick book");
    }
}
