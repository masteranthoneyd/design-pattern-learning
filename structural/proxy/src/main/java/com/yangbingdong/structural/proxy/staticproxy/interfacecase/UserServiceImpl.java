package com.yangbingdong.structural.proxy.staticproxy.interfacecase;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class UserServiceImpl implements UserService {

    @Override
    public void login(String id, String password) {
        System.out.println("Login success: " + id);
    }

}
