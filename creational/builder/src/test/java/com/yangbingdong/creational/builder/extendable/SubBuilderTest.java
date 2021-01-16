package com.yangbingdong.creational.builder.extendable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class SubBuilderTest {

    @Test
    void testSubBuilder() {
        SubClass.SubBuilder build =
            SubClass.build()
                    .p1("A")
                    .p2("B")
                    .p3("c");
        SubClass subClass = build.build();
        Assertions.assertEquals(subClass.getP1(), "A");
        System.out.println(subClass.toString());
    }

}
