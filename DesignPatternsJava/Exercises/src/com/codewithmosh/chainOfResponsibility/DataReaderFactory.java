package com.codewithmosh.chainOfResponsibility;

public class DataReaderFactory {
    public static DataReader getDataReaderChain() {
        var quickBook = new QuickBookReader();
        var numbers = new NumberReader();
        var excel = new ExcelReader();

        excel.setNext(numbers);
        numbers.setNext(quickBook);
        quickBook.setNext(null);

        return excel;
    }
}
