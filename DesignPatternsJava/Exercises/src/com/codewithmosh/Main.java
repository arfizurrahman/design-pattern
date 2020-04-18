package com.codewithmosh;

import com.codewithmosh.memento.Document;
import com.codewithmosh.memento.History;

public class Main {

    public static void main(String[] args) {
        var document = new Document();
        var history = new History();

        document.setContent("a");
        document.setFontName("Helvetica");
        document.setFontSize(11);
        history.push(document.createState());

        document.setContent("b");
        history.push(document.createState());

        document.setContent("c");
        document.setFontSize(14);
        history.push(document.createState());

        document.restore(history.pop());
        document.restore(history.pop());
        document.restore(history.pop());
        System.out.println(document);
    }
}
