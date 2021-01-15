package com.yangbingdong.creational.singleton;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public enum EnumSingleton implements Singleton {

    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
