package com.yangbingdong.principle.ocp.negative;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 *
 * 消息处理器第一版, 处理两种类型的消息, A跟B类型
 */
public class MessageHandlerV1 {

    public void handle(String message) {
        if ("A".equals(message)) {
            handleSceneA(message);
        }
        if ("B".equals(message)) {
            handleSceneB(message);
        }
    }

    protected void handleSceneA(String a) {
        System.out.println(a);
    }

    protected void handleSceneB(String b) {
        System.out.println(b);
    }
}
