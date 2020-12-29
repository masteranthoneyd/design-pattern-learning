package com.yangbingdong.principle.dip.ioc;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class DiDemo {

    public final NameSupplier nameSupplier;

    public DiDemo(NameSupplier nameSupplier) {
        this.nameSupplier = nameSupplier;
    }

    public void printName() {
        System.out.println(nameSupplier.getName());
    }

    interface NameSupplier {
        String getName();
    }

    static class MyNameSupplier implements NameSupplier {

        @Override
        public String getName() {
            return "yangbingdong";
        }
    }

    public static void main(String[] args) {
        NameSupplier nameSupplier = new MyNameSupplier();
        DiDemo diDemo = new DiDemo(nameSupplier);
        diDemo.printName();
    }
}
