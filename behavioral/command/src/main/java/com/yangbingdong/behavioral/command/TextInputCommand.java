package com.yangbingdong.behavioral.command;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class TextInputCommand implements Command {

    private final TextEditor textEditor;

    private final String s;

    public TextInputCommand(TextEditor textEditor, String s) {
        this.textEditor = textEditor;
        this.s = s;
    }

    @Override
    public void execute() {
        textEditor.append(s);
    }

    @Override
    public void undo() {
        textEditor.delete(s.length());
    }

    @Override
    public void redo() {
        textEditor.append(s);
    }
}
