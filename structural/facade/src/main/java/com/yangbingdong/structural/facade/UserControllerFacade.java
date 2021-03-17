package com.yangbingdong.structural.facade;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class UserControllerFacade {

    private final UserService userService;

    public UserControllerFacade(UserService userService) {
        this.userService = userService;
    }

    public void createUserAndWallet() {
        userService.createUser();
        userService.createWallet();
    }
}
