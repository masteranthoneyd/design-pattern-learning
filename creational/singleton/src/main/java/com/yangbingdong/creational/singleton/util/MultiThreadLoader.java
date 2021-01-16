package com.yangbingdong.creational.singleton.util;

import java.io.Closeable;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class MultiThreadLoader implements Closeable {

    public static final int DEFAULT_CONCURRENT_NUM = 100;
    public static final int MAX_CONCURRENT_NUM = 2000;
    private final ExecutorService executorService;
    private final int concurrentNum;
    private final ConcurrentHashMap<Object, String> map;
    private final CountDownLatch latch;

    private final Supplier<Object> singletonFactory;

    public MultiThreadLoader(Supplier<Object> singletonFactory, int concurrentNum) {
        if (concurrentNum < 0 || concurrentNum > MAX_CONCURRENT_NUM) {
            throw new IllegalArgumentException();
        }
        this.singletonFactory = singletonFactory;
        this.concurrentNum = concurrentNum;
        this.executorService = Executors.newFixedThreadPool(concurrentNum);
        this.map = new ConcurrentHashMap<>(16);
        this.latch = new CountDownLatch(concurrentNum);
    }

    public MultiThreadLoader(Supplier<Object> singletonFactory) {
        this(singletonFactory, DEFAULT_CONCURRENT_NUM);
    }

    public Set<Object> process() {
        for (int i = 0; i < concurrentNum; i++) {
            executorService.execute(() -> {
                map.put(singletonFactory.get(), "");
                latch.countDown();
            });
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return map.keySet();
    }

    @Override
    public void close() {
        if (executorService != null) {
            executorService.shutdown();
        }
    }
}
