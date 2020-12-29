package com.yangbingdong.principle.dip.ioc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public abstract class AfterIoc {

    public void doTest() {
        if (test()) {
            System.out.println("doTest");
        } else {
            System.out.println("No doTest");
        }
    }

    protected abstract boolean test();


    static class MyAfterIoc extends AfterIoc {

        @Override
        protected boolean test() {
            return false;
        }
    }

    static class IocRunner {
        private List<AfterIoc> iocList = new ArrayList<>();

        public void registerIoc(AfterIoc afterIoc) {
            iocList.add(afterIoc);
        }

        public void run() {
            iocList.forEach(AfterIoc::doTest);
        }
    }

    public static void main(String[] args) {
        IocRunner iocRunner = new IocRunner();
        iocRunner.registerIoc(new MyAfterIoc());
        iocRunner.run();
    }
}
