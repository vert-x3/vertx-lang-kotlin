package io.vertx.kotlin.coroutines

import io.vertx.core.AbstractVerticle
import io.vertx.core.Future

/**
 * A Verticle which run its start and stop methods in coroutine.
 * You should subclass this class instead of AbstractVerticle to create any verticles that use vertx-kotlin-coroutine.
 *
 * Created by stream.
 */
abstract class CoroutineVerticle : AbstractVerticle() {

  override fun start(startFuture: Future<Void>?) {
    runVertxCoroutine {
      try {
        start()
        startFuture?.complete()
      } catch (t: Throwable) {
        startFuture?.fail(t)
      }
    }
  }

  override fun stop(stopFuture: Future<Void>?) {
    runVertxCoroutine {
      try {
        stop()
        stopFuture?.complete()
      } catch (t: Throwable) {
        stopFuture?.fail(t)
      } finally {
        removeVertxCoroutineContext()
      }
    }
  }

  /**
   * Override this method in your verticle
   */
  override fun start() {}

  /**
   * Override this method in your verticle
   */
  override fun stop() {}
}
