package com.arfiz.proxy;

public class LogginEbookProxy implements Ebook {
    private String fileName;
    private RealBook ebook;

    public LogginEbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if (ebook == null)
            ebook = new RealBook(fileName);

        System.out.println("Logging");
        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
