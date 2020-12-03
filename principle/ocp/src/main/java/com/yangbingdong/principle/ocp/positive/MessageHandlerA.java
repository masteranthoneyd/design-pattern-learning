package com.yangbingdong.principle.ocp.positive;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class MessageHandlerA implements MessageHandler {
    @Override
    public String supportMessage() {
        return "A";
    }

    @Override
    public void handle(String s) {
        System.out.println(s);
    }
}
