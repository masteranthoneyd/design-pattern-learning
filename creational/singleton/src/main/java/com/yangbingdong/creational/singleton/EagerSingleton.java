package com.yangbingdong.creational.singleton;

import java.io.Serializable;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 *
 * 饿汉式:
 * 类加载时实例化 INSTANCE, 利用类加载机制(只加载一次)
 */
public class EagerSingleton implements Singleton, Serializable {

    private static final EagerSingleton INSTANCE = new EagerSingleton();
    private static final long serialVersionUID = 6580457649575022961L;

    public static Singleton getInstance() {
        return INSTANCE;
    }

    private EagerSingleton() {

    }
}
