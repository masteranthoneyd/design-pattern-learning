package com.yangbingdong.behavioral.tempatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
class HttpServletTest {

    @Test
    void testHttpServlet() {
        HttpMapping httpMapping = new HttpMapping();
        httpMapping.registry("/hello", new HelloServlet());

        String request = "/hello";
        HttpServlet servlet = httpMapping.getServlet(request);
        servlet.doService(request, HttpMethod.GET);

    }

}
