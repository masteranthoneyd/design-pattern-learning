package com.yangbingdong.structural.proxy.staticproxy.interfacecase;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
@ExtendWith(MockitoExtension.class)
class UserServiceTest {


    @Test
    void testLoginUsingInterface() {
        UserService userService = Mockito.spy(new UserServiceImpl());
        UserService proxy = new UserServiceProxy(userService);
        proxy.login("123", "admin123");
        verify(userService, Mockito.times(1)).login("123", "admin123");
    }
}
