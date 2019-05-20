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
package io.vertx.kotlin.amqp

import io.vertx.amqp.AmqpMessage
import io.vertx.amqp.AmqpReceiver
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.amqp.AmqpReceiver.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqp.AmqpReceiver] using Vert.x codegen.
 */
suspend fun AmqpReceiver.pipeToAwait(dst: WriteStream<AmqpMessage>): Unit {
  return awaitResult {
    this.pipeTo(dst) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.amqp.AmqpReceiver.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqp.AmqpReceiver] using Vert.x codegen.
 */
suspend fun AmqpReceiver.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

