package com.yangbingdong.creational.singleton.util;

import com.yangbingdong.creational.singleton.Singleton;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.function.Supplier;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
@ExtendWith(MockitoExtension.class)
class MultiThreadLoaderTest {

    @Test
    void testInvokeCloseMethodInTryWithResource() {
        MultiThreadLoader loader;
        try (MultiThreadLoader loaderTmp = Mockito.spy(new MultiThreadLoader(() -> new Singleton() {}))) {
            loader = loaderTmp;
        }
        verify(loader).close();
    }

    @SuppressWarnings("unchecked")
    @Test
    void testProcess() {
        Supplier<Object> supplier = mock(Supplier.class);

        when(supplier.get()).thenReturn(new Object());

        int concurrentNum = 100;
        MultiThreadLoader loader = new MultiThreadLoader(supplier, concurrentNum);
        loader.process();
        loader.close();

        verify(supplier, times(concurrentNum)).get();

    }

}
