package com.yangbingdong.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class AppTest {

    @Test
    void executeAppWithoutException() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }

}
