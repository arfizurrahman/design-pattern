package com.codewithmosh.command;

public class SetContrastCommand extends AbstractUndoableCommand{
    private float prevContrast;
    private float contrast;
    private VideoEditor videoEditor;

    public SetContrastCommand(float contrast, History history, VideoEditor videoEditor) {
        super(history, videoEditor);
        this.videoEditor = videoEditor;
        this.contrast = contrast;
        this.prevContrast = videoEditor.getContrast();
    }

    @Override
    protected void doExecute() {
        videoEditor.setContrast(contrast);
    }

    @Override
    public void undo() {
        videoEditor.setContrast(prevContrast);
    }
}
