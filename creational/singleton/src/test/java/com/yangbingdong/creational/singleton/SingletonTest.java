package com.yangbingdong.creational.singleton;


import com.yangbingdong.creational.singleton.util.MultiThreadLoader;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Set;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
@ExtendWith(MockitoExtension.class)
class SingletonTest {

    static int concurrentThreadNum = 100;

    @Test
    void testSimpleSingleton() {
        try (MultiThreadLoader loader = new MultiThreadLoader(SimpleSingleton::getInstance, concurrentThreadNum)) {
            Set<Object> singletonSet = loader.process();
            assertTrue(singletonSet.size() >= 1);
        }
    }

    @Test
    void testEagerSingleton() {
        testSingleton(EagerSingleton::getInstance);
    }

    @Test
    void testLazeSingleton() {
        testSingleton(LazySingleton::getInstance);
    }

    @Test
    void testDoubleCheckSingleton() {
        testSingleton(DoubleCheckSingleton::getInstance);
    }

    @Test
    void testInnerClassSingleton() {
        testSingleton(InnerClassSingleton::getInstance);
    }

    @Test
    void testEnumSingleton() {
        testSingleton(EnumSingleton::getInstance);
    }

    private static void testSingleton(Supplier<Object> s) {
        try (MultiThreadLoader loader = new MultiThreadLoader(s, concurrentThreadNum);) {
            Set<Object> singletonSet = loader.process();
            assertEquals(singletonSet.size(), 1);
        }
    }
}
