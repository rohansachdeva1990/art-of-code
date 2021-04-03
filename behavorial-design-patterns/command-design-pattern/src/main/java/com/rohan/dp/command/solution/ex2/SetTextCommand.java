package com.rohan.dp.command.solution.ex2;

import com.rohan.dp.command.solution.ex2.business.VideoEditor;

public class SetTextCommand extends AbstractUndoableCommand {

    private String text;

    public SetTextCommand(String text, VideoEditor videoEditor, History history) {
        super(videoEditor, history);
        this.text = text;
    }

    @Override
    public void doExecute() {
        videoEditor.setText(text);
    }

    @Override
    public void undo() {
        videoEditor.removeText();
    }
}
