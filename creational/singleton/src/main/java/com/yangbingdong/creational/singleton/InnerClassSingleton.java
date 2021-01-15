package com.yangbingdong.creational.singleton;

import java.io.Serializable;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 *
 * 利用内部类实现了线程安全并且延迟加载的单例模式, 不访问 getInstance 就不会加载并初始化 InnerSingleton
 */
public class InnerClassSingleton implements Singleton, Serializable {

    private static final long serialVersionUID = 2186944401306413816L;

    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return InnerSingleton.INSTANCE;
    }


    private static class InnerSingleton {
        private InnerSingleton() {
        }

        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    /**
     * 反序列化时调用
     */
    protected Object readResolve() {
        return InnerSingleton.INSTANCE;
    }
}

