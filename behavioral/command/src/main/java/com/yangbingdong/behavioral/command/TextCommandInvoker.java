package com.yangbingdong.behavioral.command;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class TextCommandInvoker {

    private final Deque<Command> undoCommands = new LinkedList<>();
    private final Deque<Command> redoCommands = new LinkedList<>();

    public void execute(Command command) {
        undoCommands.push(command);
        redoCommands.clear();
        command.execute();
    }

    public void undo() {
        if (undoCommands.size() == 0) {
            return;
        }
        Command command = undoCommands.pop();
        redoCommands.push(command);
        command.undo();
    }

    public void redo() {
        if (redoCommands.size() == 0) {
            return;
        }
        Command command = redoCommands.pop();
        undoCommands.push(command);
        command.redo();
    }

}
