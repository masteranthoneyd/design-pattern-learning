package com.yangbingdong.structural.bridge.core;

import com.yangbingdong.structural.bridge.impl.AllMessageEncoder;
import com.yangbingdong.structural.bridge.impl.SystemPrintAppender;
import org.junit.jupiter.api.Test;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class LoggerTest {

    @Test
    void testDefaultLog() {
        Logger logger = new Logger();
        logger.log(new LogContext("ClassA", "MethodB", "this is message"));
    }

    @Test
    void testCustomLog() {
        Logger logger = new Logger(new SystemPrintAppender(), new AllMessageEncoder());
        logger.log(new LogContext("ClassA", "MethodB", "this is message"));
    }

}
