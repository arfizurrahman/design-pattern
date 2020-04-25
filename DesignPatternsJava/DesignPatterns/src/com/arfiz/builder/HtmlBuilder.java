package com.arfiz.builder;

public class HtmlBuilder {
    private final String rootName;
    HtmlEelement root = new HtmlEelement();

    public HtmlBuilder(String rootName) {
        this.rootName = rootName;
        root.name = rootName;
    }

    public HtmlBuilder addChild(String childName, String childText) {
        var e = new HtmlEelement(childName, childText);
        root.elements.add(e);
        return this;
    }

    @Override
    public String toString() {
        return root.toString();
    }

    public void clear(){
        root = new HtmlEelement();
        root.name = rootName;
    }
}
