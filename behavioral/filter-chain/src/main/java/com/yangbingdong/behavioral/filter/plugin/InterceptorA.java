package com.yangbingdong.behavioral.filter.plugin;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class InterceptorA implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Exception {
        System.out.println("This is before InterceptorA");
        Object proceed = invocation.proceed();
        System.out.println("This is before InterceptorA");
        return proceed;
    }
}
