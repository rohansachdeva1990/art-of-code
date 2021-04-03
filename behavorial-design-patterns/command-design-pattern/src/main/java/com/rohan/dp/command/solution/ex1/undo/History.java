package com.rohan.dp.command.solution.ex1.undo;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Keeps track of all the command that we have applied
 */
public class History {
    private Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push(UndoableCommand command) {
        commands.push(command);
    }

    public UndoableCommand pop() {
        return commands.pop();
    }

    public int size() {
        return commands.size();
    }
}
