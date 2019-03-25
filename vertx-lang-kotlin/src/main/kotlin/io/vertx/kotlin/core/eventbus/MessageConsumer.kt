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
package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.Message
import io.vertx.core.eventbus.MessageConsumer
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.eventbus.MessageConsumer.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.eventbus.MessageConsumer] using Vert.x codegen.
 */
suspend fun <T> MessageConsumer<T>.pipeToAwait(dst: WriteStream<Message<T>>): Unit {
  return awaitResult {
    this.pipeTo(dst) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.eventbus.MessageConsumer.completionHandler]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.eventbus.MessageConsumer] using Vert.x codegen.
 */
suspend fun <T> MessageConsumer<T>.completionHandlerAwait(): Unit {
  return awaitResult {
    this.completionHandler { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.eventbus.MessageConsumer.unregister]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.eventbus.MessageConsumer] using Vert.x codegen.
 */
suspend fun <T> MessageConsumer<T>.unregisterAwait(): Unit {
  return awaitResult {
    this.unregister { ar -> it.handle(ar.mapEmpty()) }
  }
}

