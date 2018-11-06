package io.vertx.kotlin.coroutines

import io.vertx.core.Handler
import io.vertx.core.streams.ReadStream
import io.vertx.core.streams.WriteStream

/**
 * @author [Julien Viet](mailto:julien@julienviet.com)
 */
class TestStream<T> : ReadStream<T>, WriteStream<T> {

  var isEnded: Boolean = false
    private set
  private var paused: Boolean = false
  private lateinit var handler: Handler<T>
  private lateinit var drainHandler: Handler<Void>
  private var endHandler: Handler<Void>? = null
  private var writtenElements = 0L

  override fun exceptionHandler(handler: Handler<Throwable>): TestStream<T> {
    return this
  }

  override fun handler(handler: Handler<T>): TestStream<T> {
    this.handler = handler
    return this
  }

  override fun fetch(amount: Long): ReadStream<T> {
    writtenElements -= amount
    if (writtenElements <= 0 && paused) {
      paused = false
      writtenElements = 0
    }
    return this
  }

  override fun pause(): TestStream<T> {
    if (!isEnded) {
      paused = true
    }
    return this
  }

  override fun resume(): TestStream<T> {
    if (paused) {
      paused = false
      drainHandler.handle(null)
    }
    return this
  }

  override fun endHandler(handler: Handler<Void>): TestStream<T> {
    endHandler = handler
    return this
  }

  override fun write(data: T): TestStream<T> {
    handler.handle(data)
    writtenElements++
    return this
  }

  override fun end() {
    isEnded = true
    endHandler?.handle(null)
  }

  override fun setWriteQueueMaxSize(size: Int): TestStream<T> {
    return this
  }

  override fun writeQueueFull(): Boolean {
    return paused
  }

  override fun drainHandler(handler: Handler<Void>): TestStream<T> {
    drainHandler = handler
    return this
  }
}
