package com.yangbingdong.creational.singleton;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 *
 * 通过反射调用构造器的情况, 这种场景本身就是错误的, 既然是单例, 为什么还要通过反射调用呢?
 */
public class ReflectionInvokeSingleton implements Singleton {

    private static volatile ReflectionInvokeSingleton INSTANCE;

    private ReflectionInvokeSingleton() {
        synchronized (ReflectionInvokeSingleton.class) {
            if (INSTANCE == null) {
                INSTANCE = this;
            } else {
                throw new IllegalStateException("Already initialized.");
            }
        }
    }

    public static ReflectionInvokeSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (ReflectionInvokeSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ReflectionInvokeSingleton();
                }
            }
        }
        return INSTANCE;
    }


}
