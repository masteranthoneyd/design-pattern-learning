package com.yangbingdong.behavioral.state;

import org.junit.jupiter.api.Test;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class RadioTest {

    @Test
    void testChangeRadioState() {
        Radio radio = new Radio();
        for (int i = 0; i < 5; i++) {
            radio.pushTheButton();
        }
    }

}
