package com.yangbingdong.principle.lsp.negative;

import com.yangbingdong.principle.lsp.Echo;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class NegativeEcho extends Echo {

    @Override
    public void echo(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Input string must not be null");
        }
        System.out.println(s);
    }
}
