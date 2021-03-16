package com.yangbingdong.structural.adaptor;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class HttpControllerAdaptor implements ControllerAdaptor {

    @Override
    public boolean supported(Object controller) {
        return controller instanceof HttpController;
    }

    @Override
    public void handle(Object controller) {
        ((HttpController) controller).doHttpHandler();
    }
}
