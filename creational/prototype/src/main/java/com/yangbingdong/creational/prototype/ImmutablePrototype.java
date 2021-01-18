package com.yangbingdong.creational.prototype;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class ImmutablePrototype implements Prototype {

    private final String property;

    @Override
    public ImmutablePrototype copy() {
        return new ImmutablePrototype(this);
    }

    public ImmutablePrototype(ImmutablePrototype prototype) {
        this.property = prototype.property;
    }

    public ImmutablePrototype(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }
}
