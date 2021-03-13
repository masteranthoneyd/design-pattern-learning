package com.yangbingdong.structural.bridge.impl;

import com.yangbingdong.structural.bridge.core.Encoder;
import com.yangbingdong.structural.bridge.core.LogContext;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class AllMessageEncoder implements Encoder {

    @Override
    public String encode(LogContext context) {
        return context.getClassName() + " -> " + context.getMethodName() + ": " + context.getMessage();
    }

}
