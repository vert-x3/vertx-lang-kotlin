package io.vertx.kotlin.coroutines;

import io.vertx.core.Handler;
import io.vertx.core.streams.ReadStream;
import io.vertx.core.streams.WriteStream;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class TestStream<T> implements ReadStream<T>, WriteStream<T> {

  private boolean paused;
  private boolean ended;
  private Handler<T> handler;
  private Handler<Void> endHandler;
  private Handler<Void> drainHandler;

  public TestStream() {
  }

  public boolean isEnded() {
    return ended;
  }

  @Override
  public TestStream<T> exceptionHandler(Handler<Throwable> handler) {
    return this;
  }

  @Override
  public TestStream<T> handler(Handler<T> handler) {
    this.handler = handler;
    return this;
  }

  @Override
  public TestStream<T> pause() {
    if (!ended) {
      paused = true;
    }
    return this;
  }

  @Override
  public TestStream<T> resume() {
    if (paused) {
      paused = false;
      if (drainHandler != null) {
        drainHandler.handle(null);
      }
    }
    return this;
  }

  @Override
  public TestStream<T> endHandler(Handler<Void> handler) {
    endHandler = handler;
    return this;
  }

  @Override
  public TestStream<T> write(T data) {
    if (handler != null) {
      handler.handle(data);
    } else {
      throw new IllegalStateException();
    }
    return this;
  }

  @Override
  public void end() {
    ended = true;
    if (endHandler != null) {
      endHandler.handle(null);
    }
  }

  @Override
  public TestStream<T> setWriteQueueMaxSize(int size) {
    return this;
  }

  @Override
  public boolean writeQueueFull() {
    return paused;
  }

  @Override
  public TestStream<T> drainHandler(Handler<Void> handler) {
    drainHandler = handler;
    return this;
  }
}
