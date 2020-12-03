package com.yangbingdong.principle.ocp.positive;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class MessageHandlerManager {

    private final List<MessageHandler> messageHandlers = new ArrayList<>();

    public void addHandler(MessageHandler messageHandler) {
        messageHandlers.add(messageHandler);
    }

    public void handle(String type, String message) {
        for (MessageHandler messageHandler : messageHandlers) {
            if (messageHandler.supportMessage().equals(type)) {
                messageHandler.handle(message);
            }
        }
    }
}
