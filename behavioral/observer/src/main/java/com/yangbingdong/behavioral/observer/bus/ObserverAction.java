package com.yangbingdong.behavioral.observer.bus;

import java.lang.reflect.Method;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class ObserverAction {

    private final Object target;

    private final Method method;

    public ObserverAction(Object target, Method method) {
        this.target = target;
        this.method = method;
    }

    public void execute(Object event) {
        try {
            method.invoke(target, event);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ObserverAction that = (ObserverAction) o;

        if (target != null ? !target.equals(that.target) : that.target != null) {
            return false;
        }
        return method != null ? method.equals(that.method) : that.method == null;
    }

    @Override
    public int hashCode() {
        int result = target != null ? target.hashCode() : 0;
        result = 31 * result + (method != null ? method.hashCode() : 0);
        return result;
    }
}
