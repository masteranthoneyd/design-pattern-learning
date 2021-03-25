package com.yangbingdong.behavioral.observer.bus;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executors;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class EventBusTest {

    @Test
    void testPublishEvent() {
        EventBus eventBus = new EventBus();

        eventBus.register(new EventListenerA());
        eventBus.register(new EventListenerB());

        eventBus.publish("Hello world");
    }

    @Test
    void testAsyncEvent() {
        EventBus eventBus = new AsyncEventBus(Executors.newFixedThreadPool(2));

        eventBus.register(new EventListenerA());
        eventBus.register(new EventListenerB());

        eventBus.publish("Hello world");
    }

}
