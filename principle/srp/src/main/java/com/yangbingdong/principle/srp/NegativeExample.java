package com.yangbingdong.principle.srp;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 *
 * 单一职责原则反例, 职责不够单一
 */
public class NegativeExample {


    /**
     * 反例一: 上帝类, 做常见的就是日常的业务Service类, 东北大乱炖, 啥业务都有, 导致了高耦合
     */
    static class GodService {

        public void functionA() {
            System.out.println("Do functionA");
        }

        public void functionB() {
            System.out.println("Do functionB");
        }

        public void functionE() {
            System.out.println("Do functionE");
        }

        public void functionF() {
            System.out.println("Do functionF");
        }
    }

    /**
     * 反例二: 万能工具类, 又处理 String, 又处理 Integer
     */
    static class ServiceUtils {

        public static String handleString() {
            return "";
        }

        public static Integer handleInteger() {
            return 1;
        }
    }
}
