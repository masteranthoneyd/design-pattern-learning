package com.yangbingdong.structural.facade;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    @Mock
    private UserService userService;

    @Test
    void testCallUserController() {
        UserController controller = new UserController(userService);
        controller.createUser();
        controller.createWallet();
        assertCallUserService();
    }

    @Test
    void testCallUserControllerFacade() {
        UserControllerFacade controller = new UserControllerFacade(userService);
        controller.createUserAndWallet();
        assertCallUserService();
    }

    private void assertCallUserService() {
        Mockito.verify(userService).createUser();
        Mockito.verify(userService).createWallet();
    }
}
