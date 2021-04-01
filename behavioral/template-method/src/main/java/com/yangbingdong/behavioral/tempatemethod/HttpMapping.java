package com.yangbingdong.behavioral.tempatemethod;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class HttpMapping {

    private final Map<String, HttpServlet> mapping = new HashMap<>();

    public void registry(String url, HttpServlet httpServlet) {
        mapping.put(url, httpServlet);
    }

    public HttpServlet getServlet(String url) {
        return mapping.get(url);
    }


}
