package com.yangbingdong.principle.isp;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
public class SimpleHttpServer extends AbstractVerticle {

    private final Map<String, Consumer<RoutingContext>> map = new HashMap<>(16);
    private int port;

    public SimpleHttpServer(int port) {
        this.port = port;
    }

    @Override
    public void start() {
        Router router = Router.router(vertx);
        router.route("/:path").handler(this::handlePath);

        HttpServer httpServer = vertx.createHttpServer();
        httpServer.requestHandler(router).listen(port, listenResult -> {
            if (listenResult.failed()) {
                System.out.println("Could not start HTTP server");
                listenResult.cause().printStackTrace();
            } else {
                System.out.println("Server started");
            }
        });
    }

    private void handlePath(RoutingContext ctx) {
        String path = ctx.pathParam("path");
        Consumer<RoutingContext> consumer = map.get(path);
        if (consumer == null) {
            ctx.response().setStatusCode(404).end("Not Found");
            return;
        }
        consumer.accept(ctx);
    }

    public void regist(String path, Viewer viewer) {
        map.put(path, ctx -> out(ctx, viewer.outputJson()));
    }


    private void out(RoutingContext ctx, String msg) {
        ctx.response()
           .putHeader("Content-Type", "text/plain; charset=utf-8")
           .end(msg);
    }

    public void close() {
        vertx.close();
    }
}
