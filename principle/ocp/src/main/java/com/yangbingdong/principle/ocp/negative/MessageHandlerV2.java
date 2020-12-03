package com.yangbingdong.principle.ocp.negative;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 *
 * 这时候加了个需求, 要求也要处理类型C的消息, 那么需要在 {@link MessageHandlerV1} 的基础上改造, 同时还要修改测试类, 相当滴不科学
 */
public class MessageHandlerV2 {

    public void handle(String message) {
        if ("A".equals(message)) {
            handleSceneA(message);
        }
        if ("B".equals(message)) {
            handleSceneB(message);
        }
        if ("C".equals(message)) {
            handleSceneC(message);
        }
    }

    protected void handleSceneA(String a) {
        System.out.println(a);
    }

    protected void handleSceneB(String b) {
        System.out.println(b);
    }

    protected void handleSceneC(String c) {
        System.out.println(c);
    }
}
