package com.rohan.dp.command.solution.ex1.undo;

import com.rohan.dp.command.solution.ex1.undo.editor.HtmlDocument;

public class Main {
    public static void main(String[] args) {
        var history = new History();
        var document = new HtmlDocument();

        document.setContent("Hello World");
        var boldCommand = new BoldCommand(document, history);

        boldCommand.execute();
        System.out.println(document.getContent());

    /*
        We are not going to directly execute the undo command.
        somewhere in our application we have a undo operation to perform.
        So in that case we are going to follow as described in "simple"
        command pattern and abstract this behavior to a separate object.
        boldCommand.unexecute();
        System.out.println(document.getContent());*/

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());

    }
}
