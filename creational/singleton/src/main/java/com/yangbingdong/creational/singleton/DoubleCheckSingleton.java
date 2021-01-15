package com.yangbingdong.creational.singleton;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 *
 * 双重检查
 */
public class DoubleCheckSingleton implements Singleton {

    private static final ReentrantLock LOCK = new ReentrantLock();

    private static volatile DoubleCheckSingleton INSTANCE;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (INSTANCE == null) {
            LOCK.lock();
            try {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckSingleton();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                if(LOCK.isHeldByCurrentThread()){
                    LOCK.unlock();
                }
            }
        }
        return INSTANCE;
    }
}
