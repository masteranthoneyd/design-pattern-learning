package com.yangbingdong.creational.builder.extendable;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class SubClass {

    private final String p1;
    private final String p2;
    private final String p3;

    private SubClass(SubBuilder builder) {
        this.p1 = builder.p1;
        this.p2 = builder.p2;
        this.p3 = builder.p3;
    }

    @Override
    public String toString() {
        return "SubClass{" +
            "p1='" + p1 + '\'' +
            ", p2='" + p2 + '\'' +
            ", p3='" + p3 + '\'' +
            '}';
    }

    public static SubBuilder build() {
        return new SubBuilder();
    }

    public static class SubBuilder extends GenericBuilder<SubBuilder> {

        private String p3;

        private SubBuilder() {
        }

        public SubBuilder p3(String p3) {
            this.p3 = p3;
            return this;
        }

        public SubClass build() {
            return new SubClass(this);
        }
    }

    public String getP1() {
        return p1;
    }

    public String getP2() {
        return p2;
    }

    public String getP3() {
        return p3;
    }
}
