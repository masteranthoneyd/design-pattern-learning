package com.yangbingdong.structural.proxy.staticproxy.extendcase;

import com.yangbingdong.structural.proxy.staticproxy.interfacecase.UserService;
import com.yangbingdong.structural.proxy.staticproxy.interfacecase.UserServiceImpl;
import com.yangbingdong.structural.proxy.staticproxy.interfacecase.UserServiceProxy;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class UserServiceTest {

    @Test
    void testLoginUsingInterface() {
        UserService userService = Mockito.spy(new UserServiceImpl());
        UserService proxy = new UserServiceProxy(userService);
        proxy.login("123", "admin123");
        verify(userService, Mockito.times(1)).login("123", "admin123");
    }

}
