package com.yangbingdong.behavioral.iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class IteratorTest {

    @Test
    void testArrayIterator() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        ArrayIterator<String> iterator = new ArrayIterator<>(list);
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(iterator.next(), "A");
        Assertions.assertEquals(iterator.next(), "B");
        Assertions.assertEquals(iterator.next(), "C");
        Assertions.assertFalse(iterator.hasNext());
    }
}
