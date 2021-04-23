package com.yangbingdong.behavioral.visitor;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class TxtResourceFile extends ResourceFile implements VisitableElement {

    public TxtResourceFile(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "TXT";
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
