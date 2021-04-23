package com.yangbingdong.behavioral.visitor;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class PdfResourceFile extends ResourceFile {

    public PdfResourceFile(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "PDF";
    }

    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
