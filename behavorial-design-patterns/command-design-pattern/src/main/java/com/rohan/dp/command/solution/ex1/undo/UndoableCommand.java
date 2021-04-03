package com.rohan.dp.command.solution.ex1.undo;

// We need this because not every command is undoable
public interface UndoableCommand extends Command {
    void unexecute();
}
