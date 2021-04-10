package com.yangbingdong.behavioral.state;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class OpenState implements RadioState {

    @Override
    public void action() {
        System.out.println("Radio is opened");
    }
}
