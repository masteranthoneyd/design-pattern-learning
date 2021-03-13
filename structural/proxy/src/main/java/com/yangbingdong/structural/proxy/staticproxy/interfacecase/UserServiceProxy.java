package com.yangbingdong.structural.proxy.staticproxy.interfacecase;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class UserServiceProxy implements UserService {

    private UserService source;

    @Override
    public void login(String id, String password) {
        long start = System.currentTimeMillis();
        source.login(id, password);
        long end = System.currentTimeMillis();
        long cost = Math.subtractExact(end, start);
        logReqTime(start, cost);
    }

    private void logReqTime(long start, long cost) {
        System.out.printf("Start: %d, cost: %d%n", start, cost);
    }

    public void setSource(UserService source) {
        this.source = source;
    }

    public UserServiceProxy(UserService source) {
        this.source = source;
    }
}
