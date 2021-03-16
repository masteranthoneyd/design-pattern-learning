package com.yangbingdong.structural.adaptor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class ControllerTest {

    private DispatcherServlet dispatcherServlet;

    @BeforeEach
    void init() {
        dispatcherServlet = new DispatcherServlet();
    }

    @Test
    void testSimpleController() {
        doHandle(new SimpleController());
    }

    @Test
    void testHttpController() {
        doHandle(new HttpController());
    }

    @Test
    void testAnnotationController() {
        doHandle(new AnnotationController());
    }

    private void doHandle(Controller controller) {
        ControllerAdaptor handler = dispatcherServlet.getHandler(controller);
        handler.handle(controller);
    }
}
