package io.vertx.kotlin.coroutines;

import io.vertx.core.Context;
import io.vertx.core.Verticle;
import io.vertx.core.Vertx;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public abstract class AbstractVerticle implements Verticle {

  protected Vertx vertx;
  protected Context context;

  @Override
  public Vertx getVertx() {
    return vertx;
  }

  @Override
  public void init(Vertx vertx, Context context) {
    this.vertx = vertx;
    this.context = context;
  }
}
