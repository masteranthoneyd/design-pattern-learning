package com.yangbingdong.behavioral.filter.plugin;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class InterceptableImpl implements Interceptable {

    @Override
    public void doSomething(String s) {
        System.out.println("Invoke target: " + s);
    }
}
