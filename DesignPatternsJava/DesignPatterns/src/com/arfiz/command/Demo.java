package com.arfiz.command;

import com.arfiz.command.editor.BoldCommand;
import com.arfiz.command.editor.History;
import com.arfiz.command.editor.HtmlDocument;
import com.arfiz.command.editor.UndoCommand;

public class Demo {
    public static void main(String[] args) {
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello world");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
