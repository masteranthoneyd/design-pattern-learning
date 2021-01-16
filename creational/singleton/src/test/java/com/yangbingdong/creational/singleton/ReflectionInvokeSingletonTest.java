package com.yangbingdong.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class ReflectionInvokeSingletonTest {

    @Test
    void testReflectionInvokeConstructor() throws Exception {
        Constructor<ReflectionInvokeSingleton> constructor = ReflectionInvokeSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        ReflectionInvokeSingleton instance = constructor.newInstance();
        Assertions.assertEquals(instance, ReflectionInvokeSingleton.getInstance());
    }


    @Test
    void testCreateNewInstance() throws NoSuchMethodException {
        ReflectionInvokeSingleton.getInstance();
        Constructor<ReflectionInvokeSingleton> constructor = ReflectionInvokeSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        assertThrows(InvocationTargetException.class, constructor::newInstance);
    }

}
