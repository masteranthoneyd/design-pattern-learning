package com.yangbingdong.creational.singleton;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 *
 * 懒汉式加载, 每次调用 getInstance 都会加锁, 性能一般
 */
public class LazySingleton implements Singleton {

    private static LazySingleton INSTANCE;

    private static final ReentrantLock LOCK = new ReentrantLock();

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        LOCK.lock();
        try {
            if (INSTANCE == null) {
                INSTANCE = new LazySingleton();
            }
            return INSTANCE;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            LOCK.unlock();
        }
    }

}
