package com.yangbingdong.behavioral.filter.plugin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
@ExtendWith(MockitoExtension.class)
public class InterceptorTest {

    @Spy
    InterceptorA interceptorA;
    @Spy
    InterceptorB interceptorB;
    @Spy
    InterceptorC interceptorC;

    @Test
    void testInterceptor() throws Exception {
        InterceptorChain chain = new InterceptorChain();
        chain.addInterceptor(interceptorB);
        chain.addInterceptor(interceptorA);

        Interceptable interceptable = new InterceptableImpl();
        Interceptable proxy = (Interceptable) chain.pluginAll(interceptable);
        proxy.doSomething("666666");
        verify(interceptorA).intercept(any());
        verify(interceptorB).intercept(any());
    }

    @Test
    void testInterceptorWithNoProceed() throws Exception {
        InterceptorChain chain = new InterceptorChain();
        chain.addInterceptor(interceptorC);
        chain.addInterceptor(interceptorB);
        chain.addInterceptor(interceptorA);

        Interceptable interceptable = new InterceptableImpl();
        Interceptable proxy = (Interceptable) chain.pluginAll(interceptable);
        proxy.doSomething("666666");
    }
}
