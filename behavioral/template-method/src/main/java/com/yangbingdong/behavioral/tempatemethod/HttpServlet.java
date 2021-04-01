package com.yangbingdong.behavioral.tempatemethod;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public abstract class HttpServlet {

    public void doService(String request, HttpMethod httpMethod) {
        if (HttpMethod.GET.equals(httpMethod)) {
            doGet(request);
        }
        if (HttpMethod.POST.equals(httpMethod)) {
            doPost(request);
        }
    }

    protected abstract void doPost(String request);

    protected abstract void doGet(String request);
}
