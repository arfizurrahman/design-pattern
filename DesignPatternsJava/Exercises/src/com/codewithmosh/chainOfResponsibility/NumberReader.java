package com.codewithmosh.chainOfResponsibility;

public class NumberReader extends DataReader {

    @Override
    protected String getExtension() {
        return ".numbers";
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading from numbers spread sheet.");
    }
}
