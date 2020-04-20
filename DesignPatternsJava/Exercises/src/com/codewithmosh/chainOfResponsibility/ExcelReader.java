package com.codewithmosh.chainOfResponsibility;

public class ExcelReader extends DataReader {
    @Override
    protected String getExtension() {
        return ".xls";
    }

    @Override
    public void doRead(String fileName) {
        System.out.println("Reading using excel");
    }
}
