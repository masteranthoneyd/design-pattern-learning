package com.yangbingdong.structural.adaptor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class DispatcherServlet {

    private final List<ControllerAdaptor> controllerAdaptors;

    public DispatcherServlet() {
        this.controllerAdaptors = new ArrayList<>();
        this.register(new SimpleControllerAdaptor());
        this.register(new HttpControllerAdaptor());
        this.register(new AnnotationControllerAdaptor());
    }

    public ControllerAdaptor getHandler(Controller controller) {
        for (ControllerAdaptor controllerAdaptor : controllerAdaptors) {
            if (controllerAdaptor.supported(controller)) {
                return controllerAdaptor;
            }
        }
        return null;
    }

    public void register(ControllerAdaptor controllerAdaptor) {
        controllerAdaptors.add(controllerAdaptor);
    }
}
