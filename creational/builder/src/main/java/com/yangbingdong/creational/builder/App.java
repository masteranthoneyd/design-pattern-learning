package com.yangbingdong.creational.builder;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class App {

    public static void main(String[] args) {
        DataSource dataSource =
            DataSource.builder()
                      .host("127.0.0.1")
                      .port("6379")
                      .maxConnect(1000)
                      .maxIdle(10)
                      .timeout(3000)
                      .build();
        System.out.println(dataSource.toString());
    }
}
