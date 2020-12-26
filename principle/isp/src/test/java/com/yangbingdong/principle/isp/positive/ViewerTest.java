package com.yangbingdong.principle.isp.positive;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.ext.web.client.HttpResponse;
import io.vertx.ext.web.client.WebClient;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.concurrent.CountDownLatch;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
@ExtendWith(MockitoExtension.class)
class ViewerTest {

    @Test
    void testViewConfig() throws InterruptedException {
        Viewer viewer = new RedisConfig("127.0.0.1", "6379");
        SimpleHttpServer server = new SimpleHttpServer(8080);
        server.regist("redis", viewer);
        Vertx.vertx().deployVerticle(server);

        CountDownLatch latch = new CountDownLatch(1);
        HttpClient httpClient = new HttpClient();
        Future<String> future = Vertx.vertx().deployVerticle(httpClient);

        future.onComplete(event -> {
            httpClient.get("127.0.0.1", 8080, "/redis", body -> {
                assertNotNull(body);
                System.out.println(body);
                latch.countDown();
            });
        });
        latch.await();

        httpClient.close();
        server.close();
    }


    static class HttpClient extends AbstractVerticle {

        private WebClient webClient;

        public HttpClient() {
        }

        @Override
        public void start() {
            webClient = WebClient.create(vertx);
        }

        public void get(String host, int port, String uri, Consumer<String> bodyConsumer) {
            webClient.get(port, host, uri).send(ar -> {
                if (ar.succeeded()) {
                    HttpResponse<Buffer> response = ar.result();
                    String body = response.body().toString();
                    if (bodyConsumer != null) {
                        bodyConsumer.accept(body);
                    }
                } else {
                    ar.cause().printStackTrace();
                }
            });
        }

        public void close() {
            vertx.close();
        }
    }
}
