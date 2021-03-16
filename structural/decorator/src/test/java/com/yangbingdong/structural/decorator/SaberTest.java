package com.yangbingdong.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class SaberTest {

    @Test
    void testSaberDecorator() {
        Saber saber = new SimpleSaber();
        Saber decorator = new ExcaliburSaber(saber);
        decorator.attack();
    }
}
