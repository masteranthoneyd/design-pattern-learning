package com.yangbingdong.creational.singleton;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 *
 * 这种单例写法在多线程下可能会产生多个实例
 */
public class SimpleSingleton implements Singleton {

    private static SimpleSingleton singleton;

    private SimpleSingleton() {

    }

    public static SimpleSingleton getInstance() {
        if (singleton == null) {
            System.out.println("SimpleSingleton::getInstance");
            singleton = new SimpleSingleton();
        }
        return singleton;
    }


}
