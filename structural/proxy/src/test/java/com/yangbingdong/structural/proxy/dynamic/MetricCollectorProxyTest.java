package com.yangbingdong.structural.proxy.dynamic;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class MetricCollectorProxyTest {

    @Test
    void testDynamicProxy() {
        UserServiceImpl source = new UserServiceImpl();
        MetricCollectorProxy proxy = Mockito.spy(new MetricCollectorProxy(source));
        UserService userService = MetricCollectorProxy.createProxy(source, proxy);
        userService.login("123", "admin123");
    }
}
