package com.yangbingdong.behavioral.observer.bus;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class EventListenerB {

    @Subscriber
    public void listen(String event) {
        System.out.println("B listened: " + event + ", " + Thread.currentThread().getName());
    }
}
