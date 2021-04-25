package com.yangbingdong.behavioral.command;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class Client {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        TextCommandInvoker invoker = new TextCommandInvoker();
        invoker.execute(new TextInputCommand(editor, "hello "));
        invoker.execute(new TextInputCommand(editor, "world"));
        invoker.undo();
        invoker.redo();

        invoker.execute(new TextDeleteCommand(editor));
        invoker.undo();

        invoker.execute(new TextInputCommand(editor, "!"));
        invoker.redo();
    }
}
