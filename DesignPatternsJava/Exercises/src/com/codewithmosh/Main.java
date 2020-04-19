package com.codewithmosh;

import com.codewithmosh.command.History;
import com.codewithmosh.command.SetContrastCommand;
import com.codewithmosh.command.SetTextCommand;
import com.codewithmosh.command.VideoEditor;
import com.codewithmosh.template.StoreDataWindow;

public class Main {
    public static void main(String[] args) {
        var videoEditor = new VideoEditor();
        var history = new History();

        var setTextCommand = new SetTextCommand("Video Title",history,videoEditor);
        setTextCommand.execute();

        var setContrastCommand = new SetContrastCommand(10.5f, history, videoEditor);
        setContrastCommand.execute();
        System.out.println(videoEditor);

        setTextCommand.undo();
        setContrastCommand.undo();
        System.out.println(videoEditor);
    }
}
