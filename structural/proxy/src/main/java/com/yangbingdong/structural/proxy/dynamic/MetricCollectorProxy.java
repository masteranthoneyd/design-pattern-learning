package com.yangbingdong.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class MetricCollectorProxy implements InvocationHandler {

    private final Object source;

    public MetricCollectorProxy(Object source) {
        this.source = source;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = method.invoke(source, args);
        long end = System.currentTimeMillis();
        long cost = Math.subtractExact(end, start);
        logReqTime(start, cost);
        return result;
    }

    protected void logReqTime(long start, long cost) {
        System.out.printf("Start: %d, cost: %d%n", start, cost);
    }

    @SuppressWarnings("unchecked")
    public static <T> T createProxy(Object source, MetricCollectorProxy h) {
        return (T) Proxy.newProxyInstance(source.getClass().getClassLoader(), source.getClass().getInterfaces(), h);
    }
}
