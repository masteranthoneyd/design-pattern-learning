package com.yangbingdong.behavioral.filter.plugin;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class InterceptorB implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Exception {
        System.out.println("This is before InterceptorB");
        Object proceed = invocation.proceed();
        System.out.println("This is before InterceptorB");
        return proceed;
    }
}
