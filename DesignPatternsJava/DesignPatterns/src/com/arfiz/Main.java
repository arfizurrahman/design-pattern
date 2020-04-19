package com.arfiz;

import com.arfiz.command.*;
import com.arfiz.command.editor.BoldCommand;
import com.arfiz.command.editor.History;
import com.arfiz.command.editor.HtmlDocument;
import com.arfiz.command.editor.UndoCommand;
import com.arfiz.command.fx.Button;
import com.arfiz.strategy.BlackAndWhiteFilter;
import com.arfiz.strategy.ImageStorage;
import com.arfiz.strategy.JpegCompressor;
import com.arfiz.strategy.PngCompressor;
import com.arfiz.template.GenerateReportTask;
import com.arfiz.template.TransferMoneyTask;

public class Main {
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
