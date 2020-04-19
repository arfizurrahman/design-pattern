package com.codewithmosh.command;

public class SetTextCommand extends AbstractUndoableCommand{
    private String text;
    private VideoEditor videoEditor;

    public SetTextCommand(String text, History history, VideoEditor videoEditor) {
        super(history, videoEditor);
        this.text = text;
        this.videoEditor = videoEditor;
    }

    @Override
    public void undo() {
        videoEditor.removeText();
    }

    @Override
    protected void doExecute() {
        videoEditor.setText(text);
    }
}
