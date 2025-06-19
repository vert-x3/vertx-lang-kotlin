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

import io.vertx.amqp.AmqpConnection
import io.vertx.amqp.AmqpReceiver
import io.vertx.amqp.AmqpReceiverOptions
import io.vertx.amqp.AmqpSender
import io.vertx.amqp.AmqpSenderOptions
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.amqp.AmqpConnection.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqp.AmqpConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with coAwait()", replaceWith = ReplaceWith("close().coAwait()"))
suspend fun AmqpConnection.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.amqp.AmqpConnection.createReceiver]
 *
 * @param address The source address to attach the consumer to, must not be <code>null</code>
 * @return [AmqpReceiver]
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqp.AmqpConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createReceiver returning a future and chain with coAwait()", replaceWith = ReplaceWith("createReceiver(address).coAwait()"))
suspend fun AmqpConnection.createReceiverAwait(address: String): AmqpReceiver {
  return awaitResult {
    this.createReceiver(address, it)
  }
}

/**
 * Suspending version of method [io.vertx.amqp.AmqpConnection.createReceiver]
 *
 * @param address The source address to attach the consumer to.
 * @param receiverOptions The options for this receiver.
 * @return [AmqpReceiver]
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqp.AmqpConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createReceiver returning a future and chain with coAwait()", replaceWith = ReplaceWith("createReceiver(address, receiverOptions).coAwait()"))
suspend fun AmqpConnection.createReceiverAwait(address: String, receiverOptions: AmqpReceiverOptions): AmqpReceiver {
  return awaitResult {
    this.createReceiver(address, receiverOptions, it)
  }
}

/**
 * Suspending version of method [io.vertx.amqp.AmqpConnection.createDynamicReceiver]
 *
 * @return [AmqpReceiver]
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqp.AmqpConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createDynamicReceiver returning a future and chain with coAwait()", replaceWith = ReplaceWith("createDynamicReceiver().coAwait()"))
suspend fun AmqpConnection.createDynamicReceiverAwait(): AmqpReceiver {
  return awaitResult {
    this.createDynamicReceiver(it)
  }
}

/**
 * Suspending version of method [io.vertx.amqp.AmqpConnection.createSender]
 *
 * @param address The target address to attach to, must not be <code>null</code>
 * @return [AmqpSender]
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqp.AmqpConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createSender returning a future and chain with coAwait()", replaceWith = ReplaceWith("createSender(address).coAwait()"))
suspend fun AmqpConnection.createSenderAwait(address: String): AmqpSender {
  return awaitResult {
    this.createSender(address, it)
  }
}

/**
 * Suspending version of method [io.vertx.amqp.AmqpConnection.createSender]
 *
 * @param address The target address to attach to, allowed to be <code>null</code> if the <code>options</code> configures the sender to be attached to a dynamic address (provided by the broker).
 * @param options The AMQP sender options
 * @return [AmqpSender]
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqp.AmqpConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createSender returning a future and chain with coAwait()", replaceWith = ReplaceWith("createSender(address, options).coAwait()"))
suspend fun AmqpConnection.createSenderAwait(address: String, options: AmqpSenderOptions): AmqpSender {
  return awaitResult {
    this.createSender(address, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.amqp.AmqpConnection.createAnonymousSender]
 *
 * @return [AmqpSender]
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqp.AmqpConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createAnonymousSender returning a future and chain with coAwait()", replaceWith = ReplaceWith("createAnonymousSender().coAwait()"))
suspend fun AmqpConnection.createAnonymousSenderAwait(): AmqpSender {
  return awaitResult {
    this.createAnonymousSender(it)
  }
}

