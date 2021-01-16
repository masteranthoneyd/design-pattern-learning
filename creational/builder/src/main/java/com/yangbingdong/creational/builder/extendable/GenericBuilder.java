package com.yangbingdong.creational.builder.extendable;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class GenericBuilder<T extends GenericBuilder<T>> {

    protected String p1;

    protected String p2;

    private final T thisAsT;

    @SuppressWarnings("unchecked")
    public GenericBuilder() {
        thisAsT = (T) this;
    }

    public T p1(String p1) {
        this.p1 = p1;
        return thisAsT;
    }

    public T p2(String p2) {
        this.p2 = p2;
        return thisAsT;
    }
}
