package com.yangbingdong.structural.adaptor;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class SimpleControllerAdaptor implements ControllerAdaptor {

    @Override
    public boolean supported(Object controller) {
        return (controller instanceof SimpleController);
    }

    @Override
    public void handle(Object controller) {
        ((SimpleController) controller).doSimpleHandler();
    }
}
