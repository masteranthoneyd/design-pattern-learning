package com.yangbingdong.behavioral.state;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class Radio {

    private RadioState radioState = new CloseState();

    public void pushTheButton() {
        radioState = radioState instanceof CloseState ? new OpenState() : new CloseState();
        radioState.action();
    }
}
