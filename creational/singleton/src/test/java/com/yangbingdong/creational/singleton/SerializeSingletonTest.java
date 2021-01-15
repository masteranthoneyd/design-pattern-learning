package com.yangbingdong.creational.singleton;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
@ExtendWith(MockitoExtension.class)
public class SerializeSingletonTest {

    @Test
    void testSerializeEnumSingle() throws Exception {
        byte[] buf = serialize(EnumSingleton.getInstance());
        Object o = deserialize(buf);
        assertEquals(EnumSingleton.getInstance(), o);
    }

    @Test
    void testSerializeNoDeclareReadResolveSingleton() throws Exception {
        Singleton instance = EagerSingleton.getInstance();
        byte[] buf = serialize(instance);
        Object o = deserialize(buf);
        assertNotEquals(EnumSingleton.getInstance(), o);
    }

    @Test
    void testSerializeDeclareReadResolveSingleton() throws Exception {
        Singleton instance = InnerClassSingleton.getInstance();
        byte[] buf = serialize(instance);
        Object o = deserialize(buf);
        assertEquals(InnerClassSingleton.getInstance(), o);
    }

    private byte[] serialize(Object o) throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(outputStream);
        out.writeObject(o);
        return outputStream.toByteArray();
    }

    private Object deserialize(byte[] buffer) throws Exception {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(buffer);
        ObjectInputStream in = new ObjectInputStream(inputStream);
        return in.readObject();
    }
}
