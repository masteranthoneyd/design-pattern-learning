package com.yangbingdong.behavioral.visitor.negative;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class Rar extends ResourceFile {
    public Rar(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "RAR";
    }
}
