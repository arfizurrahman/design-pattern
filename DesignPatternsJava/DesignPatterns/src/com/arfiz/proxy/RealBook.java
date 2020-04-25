package com.arfiz.proxy;

public class RealBook implements Ebook{
    private String fileName;

    public RealBook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("Loading the ebook " + fileName);
    }

    @Override
    public void show() {
        System.out.println("Showing the ebook " + fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
