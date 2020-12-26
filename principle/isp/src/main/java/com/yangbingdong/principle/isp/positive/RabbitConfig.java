package com.yangbingdong.principle.isp.positive;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class RabbitConfig implements Hotfixer {
    private String host;
    private String port;

    public RabbitConfig(String host, String port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public void update() {
        System.out.println("Update RabbitConfig");
    }


    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }
}
