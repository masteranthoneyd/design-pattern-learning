package com.yangbingdong.structural.proxy.dynamic;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class UserServiceImpl implements UserService {


    @Override
    public void login(String id, String password) {
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Login success: " + id);
    }

}
