package com.yangbingdong.behavioral.visitor;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class Extractor implements Visitor {

    @Override
    public void visit(TxtResourceFile resourceFile) {
        System.out.println("Extract txt file: " + resourceFile.getName());
    }

    @Override
    public void visit(PptResourceFile resourceFile) {
        System.out.println("Extract ppt file: " + resourceFile.getName());
    }

    @Override
    public void visit(PdfResourceFile resourceFile) {
        System.out.println("Extract pdf file: " + resourceFile.getName());
    }
}
