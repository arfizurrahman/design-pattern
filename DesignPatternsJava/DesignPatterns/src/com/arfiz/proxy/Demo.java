package com.arfiz.proxy;

public class Demo {
    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (var fileName : fileNames)
            library.add(new LogginEbookProxy(fileName));

        library.openEBook("a");
    }
}
