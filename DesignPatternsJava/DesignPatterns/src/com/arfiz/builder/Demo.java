package com.arfiz.builder;

public class Demo {
    public static void main(String[] args) {
        var builder = new HtmlBuilder("ul");
        builder.addChild("li","Pen").addChild("li","Pencil");
        System.out.println(builder.toString());
    }
}
