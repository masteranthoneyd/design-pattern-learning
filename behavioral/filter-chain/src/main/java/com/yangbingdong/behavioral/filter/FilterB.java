package com.yangbingdong.behavioral.filter;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class FilterB implements Filter {

    @Override
    public void filter(String s, FilterChain chain) {
        System.out.println("This is filterB");
        chain.filter(s);
    }
}
