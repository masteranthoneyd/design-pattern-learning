package com.yangbingdong.behavioral.filter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
@ExtendWith(MockitoExtension.class)
class FilterChainTest {

    @Spy
    FilterA filterA;

    @Spy
    FilterB filterB;

    @Spy
    FilterC filterC;

    @Spy
    Service service;

    @Test
    void testFilterChain() {
        FilterChain chain = new FilterChain(service);
        chain.addFilter(filterA);
        chain.addFilter(filterB);

        chain.filter("ybd");
        Mockito.verify(filterA).filter("ybd", chain);
        Mockito.verify(filterB).filter("ybd", chain);
        Mockito.verify(service).doService("ybd");
    }

    @Test
    void testFilterChain2() {
        FilterChain chain = new FilterChain(service);
        chain.addFilter(filterA);
        chain.addFilter(filterC);
        chain.addFilter(filterB);

        chain.filter("ybd");
        Mockito.verify(filterA).filter("ybd", chain);
        Mockito.verify(filterB, Mockito.never()).filter("ybd", chain);
        Mockito.verify(service, Mockito.never()).doService("ybd");
    }

}
