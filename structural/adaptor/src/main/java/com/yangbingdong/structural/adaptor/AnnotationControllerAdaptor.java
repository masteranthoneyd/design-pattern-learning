package com.yangbingdong.structural.adaptor;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class AnnotationControllerAdaptor implements ControllerAdaptor {

    @Override
    public boolean supported(Object controller) {
        return controller instanceof AnnotationController;
    }

    @Override
    public void handle(Object controller) {
        ((AnnotationController) controller).doAnnotationHandler();
    }
}
