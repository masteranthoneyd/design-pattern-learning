package com.yangbingdong.creational.builder;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class DataSource {

    private final String host;

    private final String port;

    private final int maxConnect;

    private final int maxIdle;

    private final int timeout;

    public static DataSourceBuilder builder() {
        return new DataSourceBuilder();
    }

    private DataSource(DataSourceBuilder builder) {
        this.host = builder.host;
        this.port = builder.port;
        this.maxConnect = builder.maxConnect;
        this.maxIdle = builder.maxIdle;
        this.timeout = builder.timeout;
    }

    @Override
    public String toString() {
        return "DataSource{" +
            "host='" + host + '\'' +
            ", port='" + port + '\'' +
            ", maxConnect=" + maxConnect +
            ", maxIdle=" + maxIdle +
            ", timeout=" + timeout +
            '}';
    }

    public static class DataSourceBuilder {
        private DataSourceBuilder() {
        }

        private String host;

        private String port;

        private int maxConnect;

        private int maxIdle;

        private int timeout;

        public DataSourceBuilder host(String host) {
            this.host = host;
            return this;
        }

        public DataSourceBuilder port(String port) {
            this.port = port;
            return this;
        }

        public DataSourceBuilder maxConnect(int maxConnect) {
            this.maxConnect = maxConnect;
            return this;
        }

        public DataSourceBuilder maxIdle(int maxIdle) {
            this.maxIdle = maxIdle;
            return this;
        }

        public DataSourceBuilder timeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public DataSource build() {
            return new DataSource(this);
        }
    }

}
