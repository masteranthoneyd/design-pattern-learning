package com.yangbingdong.behavioral.filter;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public interface Filter {

    void filter(String s, FilterChain chain);
}
