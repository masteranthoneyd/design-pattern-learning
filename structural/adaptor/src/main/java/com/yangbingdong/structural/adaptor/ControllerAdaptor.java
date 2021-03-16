package com.yangbingdong.structural.adaptor;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public interface ControllerAdaptor {

    boolean supported(Object controller);

    void handle(Object controller);
}
