package com.yangbingdong.behavioral.command;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public interface Command {

    void execute();

    void undo();

    void redo();

}
