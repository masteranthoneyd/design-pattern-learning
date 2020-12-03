package com.yangbingdong.principle.ocp.positive;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class MessageHandlerC implements MessageHandler {
    @Override
    public String supportMessage() {
        return "C";
    }

    @Override
    public void handle(String s) {
        System.out.println(s);
    }
}
