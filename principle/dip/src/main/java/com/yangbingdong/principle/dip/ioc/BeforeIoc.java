package com.yangbingdong.principle.dip.ioc;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class BeforeIoc {

    public void doTest() {
        if (test()) {
            System.out.println("doTest");
        } else {
            System.out.println("No doTest");
        }
    }

    private boolean test() {
        return false;
    }


    public static void main(String[] args) {
        BeforeIoc beforeIoc = new BeforeIoc();
        beforeIoc.doTest();
    }
}
