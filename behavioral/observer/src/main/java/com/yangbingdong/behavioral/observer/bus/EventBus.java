package com.yangbingdong.behavioral.observer.bus;

import java.util.List;
import java.util.concurrent.Executor;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class EventBus {

    private final ObserverRegistry observerRegistry = new ObserverRegistry();
    private final Executor executor;

    protected EventBus(Executor executor) {
        this.executor = executor;
    }

    public EventBus() {
        this(Runnable::run);
    }

    public void register(Object observer) {
        observerRegistry.register(observer);
    }

    public void publish(Object event) {
        List<ObserverAction> observerActions = observerRegistry.getMatchedObserverActions(event);
        for (ObserverAction observerAction : observerActions) {
            executor.execute(() -> observerAction.execute(event));
        }
    }
}
