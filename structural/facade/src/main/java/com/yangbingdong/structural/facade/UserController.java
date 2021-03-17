package com.yangbingdong.structural.facade;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void createUser() {
        userService.createUser();
    }

    public void createWallet() {
        userService.createWallet();
    }
}
