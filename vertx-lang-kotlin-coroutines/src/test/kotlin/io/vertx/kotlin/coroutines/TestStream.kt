/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.coroutines

import io.vertx.core.AsyncResult
import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.core.Promise
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

  override fun write(data: T): Future<Void> {
    val promise = Promise.promise<Void>()
    write(data, promise)
    return promise.future()
  }

  override fun write(data: T, completionHandler: Handler<AsyncResult<Void>>?) {
    handler.handle(data)
    writtenElements++
    if (completionHandler != null) {
      completionHandler.handle(Future.succeededFuture())
    }
  }

  override fun end(completionHandler: Handler<AsyncResult<Void>>?) {
    isEnded = true
    endHandler?.handle(null)
    if (completionHandler != null) {
      completionHandler.handle(Future.succeededFuture())
    }
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
