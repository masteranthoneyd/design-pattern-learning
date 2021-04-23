package com.yangbingdong.behavioral.visitor;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public abstract class ResourceFile implements VisitableElement {

    protected String name;

    public ResourceFile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getType();
}
