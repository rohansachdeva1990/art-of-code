package com.rohan.dp.command.solution.ex2;

import com.rohan.dp.command.solution.ex2.business.VideoEditor;

public class Main {
    public static void main(String[] args) {
        var videoEditor = new VideoEditor();
        var history = new History();

        var setTextCommand = new SetTextCommand("Video Title", videoEditor, history);
        setTextCommand.execute();
        System.out.println("TEXT: " + videoEditor);

        var setContrast = new SetContrastCommand(1, videoEditor, history);
        setContrast.execute();
        System.out.println("CONTRAST: " + videoEditor);

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);
    }
}
