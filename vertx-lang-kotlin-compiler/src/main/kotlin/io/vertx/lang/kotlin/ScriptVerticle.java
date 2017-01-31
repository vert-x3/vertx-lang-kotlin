package io.vertx.lang.kotlin;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.Vertx;

import java.lang.reflect.Method;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class ScriptVerticle extends AbstractVerticle {

  private final Class<?> clazz;
  private Object instance;

  public ScriptVerticle(Class<?> clazz) {
    this.clazz = clazz;
  }

  @Override
  public void start(Future<Void> startFuture) throws Exception {
    instance = clazz.getConstructor(Vertx.class, Context.class).newInstance(vertx, context);
    try {
      Method start = clazz.getDeclaredMethod("start", Future.class);
      start.invoke(instance, startFuture);
    } catch (NoSuchMethodException ignore) {
      startFuture.complete();
    }
  }

  @Override
  public void stop(Future<Void> stopFuture) throws Exception {
    try {
      Method stop = clazz.getDeclaredMethod("stop");
      stop.invoke(instance);
      stopFuture.complete();
    } catch (NoSuchMethodException e) {
      try {
        Method stop = clazz.getDeclaredMethod("stop", Future.class);
        stop.invoke(instance, stopFuture);
      } catch (NoSuchMethodException ignore) {
      }
    }
  }
}
