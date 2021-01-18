package com.yangbingdong.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class PrototypeTest {

    @Test
    void testPrototype() {
        String property = "prototype";
        ImmutablePrototype prototype = new ImmutablePrototype(property);

        ImmutablePrototype copy = prototype.copy();
        assertEquals(copy.getProperty(), prototype.getProperty());
    }

}
