package com.yangbingdong.behavioral.tempatemethod;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void doPost(String request) {
        System.out.println("GET: " + request);
    }

    @Override
    protected void doGet(String request) {
        System.out.println("POST: " + request);
    }
}
