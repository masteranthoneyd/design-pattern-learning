package com.yangbingdong.behavioral.visitor;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public interface Visitor {

    void visit(TxtResourceFile resourceFile);

    void visit(PptResourceFile resourceFile);

    void visit(PdfResourceFile resourceFile);
}
