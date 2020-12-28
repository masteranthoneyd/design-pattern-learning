package com.yangbingdong.principle.isp;

import com.alibaba.fastjson.JSONObject;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class RedisConfig implements Hotfixer, Viewer {
    private String host;
    private String port;

    public RedisConfig(String host, String port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public void update() {
        System.out.println("Update RedisConfig");
    }

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    @Override
    public String outputJson() {
        return JSONObject.toJSONString(this);
    }
}
