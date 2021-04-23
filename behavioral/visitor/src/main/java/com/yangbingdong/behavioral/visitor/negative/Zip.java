package com.yangbingdong.behavioral.visitor.negative;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class Zip extends ResourceFile {
    public Zip(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "ZIP";
    }
}
