package io.vertx.verticle

import io.vertx.core.Context
import io.vertx.core.Future
import io.vertx.core.Verticle
import io.vertx.core.Vertx

class KotlinVerticle : Verticle {
  private var vertx: Vertx? = null

  override fun init(vertx: Vertx?, context: Context?) {
    this.vertx = vertx
  }

  override fun start(startFuture: Future<Void>?) {
    startFuture?.complete()
  }

  override fun stop(stopFuture: Future<Void>?) {
    stopFuture?.complete()
  }

  override fun getVertx() = vertx
}
