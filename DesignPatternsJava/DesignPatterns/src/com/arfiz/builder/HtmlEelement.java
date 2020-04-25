package com.arfiz.builder;

import java.util.ArrayList;
import java.util.List;

public class HtmlEelement {
    public String name, text;
    public List<HtmlEelement> elements = new ArrayList<>();
    private static final int indentSize = 2;

    public HtmlEelement() {

    }

    public HtmlEelement(String name, String text) {
        this.name = name;
        this.text = text;
    }

    private String toStringImplementation(int indent) {
        var sb = new StringBuilder();
        var i = new String(new char[indentSize * indent]).replace("\0", " ");
        sb.append(i + "<" + name + ">\n");

        if (text != null) {
            sb.append(new String(new char[indentSize * (indent + 1)]).replace("\0", " "));
            sb.append(text + "\n");
        }

        for (var e : elements) {
            sb.append(e.toStringImplementation(indent + 1));
        }

        sb.append(i + "</" + name + ">\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        return toStringImplementation(0);
    }
}
