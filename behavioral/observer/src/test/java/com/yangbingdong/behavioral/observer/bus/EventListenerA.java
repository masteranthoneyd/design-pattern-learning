package com.yangbingdong.behavioral.observer.bus;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class EventListenerA {

    @Subscriber
    public void listen(String event) {
        System.out.println("A listened: " + event + ", " + Thread.currentThread().getName());
    }
}
