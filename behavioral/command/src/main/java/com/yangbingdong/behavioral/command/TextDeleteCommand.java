package com.yangbingdong.behavioral.command;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class TextDeleteCommand implements Command {

    private final TextEditor textEditor;
    private String snapshot;

    public TextDeleteCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        this.snapshot = textEditor.getText();
        textEditor.delete(1);
    }

    @Override
    public void undo() {
        textEditor.restore(snapshot);
    }

    @Override
    public void redo() {
        this.execute();
    }
}
