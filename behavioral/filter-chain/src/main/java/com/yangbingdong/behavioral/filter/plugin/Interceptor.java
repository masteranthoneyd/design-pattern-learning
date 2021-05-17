package com.yangbingdong.behavioral.filter.plugin;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public interface Interceptor {

    Object intercept(Invocation invocation) throws Exception;

    default Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

}
