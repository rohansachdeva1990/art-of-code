package com.rohan.dp.command.solution.ex2;


import com.rohan.dp.command.solution.ex2.business.VideoEditor;

public class SetContrastCommand extends AbstractUndoableCommand {

    private float contrast;
    private float prevContrast;

    public SetContrastCommand(float contrast, VideoEditor videoEditor, History history) {
        super(videoEditor, history);
        this.contrast = contrast;
        prevContrast = videoEditor.getContrast();
    }

    @Override
    public void doExecute() {
        videoEditor.setContrast(contrast);
    }

    @Override
    public void undo() {
        videoEditor.setContrast(prevContrast);
    }
}
