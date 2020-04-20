package com.codewithmosh;

import com.codewithmosh.chainOfResponsibility.*;

public class Main {
    public static void main(String[] args) {
        var reader = DataReaderFactory.getDataReaderChain();
        reader.read("abc.xls");
        reader.read("abc.numbers");
        reader.read("abc.qbw");
    }
}
