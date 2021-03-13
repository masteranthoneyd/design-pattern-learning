package com.yangbingdong.structural.bridge.core;

import com.yangbingdong.structural.bridge.impl.DefaultEncoder;
import com.yangbingdong.structural.bridge.impl.SystemPrintAppender;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class Logger {

    private final Appender appender;

    private final Encoder encoder;

    public Logger(Appender appender, Encoder encoder) {
        this.appender = appender;
        this.encoder = encoder;
    }

    public Logger() {
        appender = new SystemPrintAppender();
        encoder = new DefaultEncoder();
    }

    public void log(LogContext logContext) {
        appender.append(encoder.encode(logContext));
    }

}
