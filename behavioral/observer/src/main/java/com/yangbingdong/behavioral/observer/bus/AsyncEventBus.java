package com.yangbingdong.behavioral.observer.bus;

import java.util.concurrent.Executor;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class AsyncEventBus extends EventBus {

    public AsyncEventBus(Executor executor) {
        super(executor);
    }
}
