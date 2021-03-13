package com.yangbingdong.structural.proxy.staticproxy.extendcase;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class UserService {

    public void login(String id, String password) {
        System.out.println("Login success: " + id);
    }
}
