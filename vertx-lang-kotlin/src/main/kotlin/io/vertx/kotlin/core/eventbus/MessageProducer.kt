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

import io.vertx.core.eventbus.MessageProducer
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.eventbus.MessageProducer.write]
 *
 * @param body the message body
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.eventbus.MessageProducer] using Vert.x codegen.
 */
@Deprecated(message = "Instead use write returning a future and chain with coAwait()", replaceWith = ReplaceWith("write(body).coAwait()"))
suspend fun <T> MessageProducer<T>.writeAwait(body: T): Unit {
  return awaitResult {
    this.write(body, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.eventbus.MessageProducer.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.eventbus.MessageProducer] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with coAwait()", replaceWith = ReplaceWith("close().coAwait()"))
suspend fun <T> MessageProducer<T>.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

