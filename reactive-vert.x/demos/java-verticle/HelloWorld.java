import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.platform.Verticle;

public class HelloWorld extends Verticle {
  public void start() {
    vertx.createHttpServer().requestHandler(new Handler<HttpServerRequest>() {
      public void handle(HttpServerRequest req) {                
        req.response().end("<body><h1>Hello World from Java!</h1></body>");
      }
    }).listen(8080);
  }
}
