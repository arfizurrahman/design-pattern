package com.arfiz.memento;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();
        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        history.push(editor.createState());
        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }
}
