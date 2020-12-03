package com.yangbingdong.principle.ocp.positive;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public interface MessageHandler {

    String supportMessage();

    void handle(String s);
}
