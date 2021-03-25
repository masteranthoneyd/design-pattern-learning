package com.yangbingdong.behavioral.observer.bus;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

import static java.util.stream.Collectors.toList;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class ObserverRegistry {

    private final ConcurrentHashMap<Class<?>, CopyOnWriteArraySet<ObserverAction>> repository = new ConcurrentHashMap<>();


    public void register(Object observer) {
        Map<Class<?>, Collection<Method>> subscriberMethodMap = findSubscribeWithAnnotation(observer);
        subscriberMethodMap.forEach((eventClass, methods) -> {
            CopyOnWriteArraySet<ObserverAction> observerActions = repository.get(eventClass);
            if (observerActions == null) {
                repository.putIfAbsent(eventClass, new CopyOnWriteArraySet<>());
                observerActions = repository.get(eventClass);
            }
            observerActions.addAll(methods.stream().map(m -> new ObserverAction(observer, m)).collect(toList()));
        });
    }

    private Map<Class<?>, Collection<Method>> findSubscribeWithAnnotation(Object observer) {
        Map<Class<?>, Collection<Method>> map = new HashMap<>(1 << 4);
        for (Method method : observer.getClass().getDeclaredMethods()) {
            if (!method.isAnnotationPresent(Subscriber.class) || method.isSynthetic()) {
                continue;
            }
            Parameter[] parameters = method.getParameters();
            if (parameters.length != 1) {
                throw new IllegalArgumentException("Subscriber method must have only one parameter!");
            }
            Class<?> paramType = parameters[0].getType();
            if (!map.containsKey(paramType)) {
                map.put(paramType, new ArrayList<>(16));
            }
            map.get(paramType).add(method);

        }
        return map;
    }

    public List<ObserverAction> getMatchedObserverActions(Object event) {
        Class<?> targetEventType = event.getClass();
        List<ObserverAction> res = new ArrayList<>();
        repository.forEach((eventType, observerActions) -> {
            if (eventType.isAssignableFrom(targetEventType)) {
                res.addAll(observerActions);
            }
        });
        return res;
    }
}
