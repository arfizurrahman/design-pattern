package com.arfiz.command.editor;

public interface UndoableCommand extends Command{
    void unexecute();
}
