package com.yangbingdong.structural.bridge.core;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */

public class LogContext {

    private String className;

    private String methodName;

    private String message;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LogContext(String className, String methodName, String message) {
        this.className = className;
        this.methodName = methodName;
        this.message = message;
    }
}
