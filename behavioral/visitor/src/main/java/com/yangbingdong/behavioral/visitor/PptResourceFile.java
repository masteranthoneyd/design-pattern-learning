package com.yangbingdong.behavioral.visitor;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class PptResourceFile extends ResourceFile {

    public PptResourceFile(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "PPT";
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
