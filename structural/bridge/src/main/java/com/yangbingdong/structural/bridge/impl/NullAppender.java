package com.yangbingdong.structural.bridge.impl;

import com.yangbingdong.structural.bridge.core.Appender;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class NullAppender implements Appender {

    @Override
    public void append(String message) {
        // do not append
    }
}
