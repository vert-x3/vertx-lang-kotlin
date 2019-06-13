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

import io.vertx.amqp.AmqpClient
import io.vertx.amqp.AmqpConnection
import io.vertx.amqp.AmqpMessage
import io.vertx.amqp.AmqpReceiver
import io.vertx.amqp.AmqpReceiverOptions
import io.vertx.amqp.AmqpSender
import io.vertx.amqp.AmqpSenderOptions
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.amqp.AmqpClient.connect]
 *
 * @return [AmqpConnection]
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqp.AmqpClient] using Vert.x codegen.
 */
suspend fun AmqpClient.connectAwait(): AmqpConnection {
  return awaitResult {
    this.connect(it)
  }
}

/**
 * Suspending version of method [io.vertx.amqp.AmqpClient.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqp.AmqpClient] using Vert.x codegen.
 */
suspend fun AmqpClient.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.amqp.AmqpClient.createReceiver]
 *
 * @param address The source address to attach the consumer to, must not be <code>null</code>
 * @return [AmqpReceiver]
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqp.AmqpClient] using Vert.x codegen.
 */
suspend fun AmqpClient.createReceiverAwait(address: String): AmqpReceiver {
  return awaitResult {
    this.createReceiver(address, it)
  }
}

/**
 * Suspending version of method [io.vertx.amqp.AmqpClient.createReceiver]
 *
 * @param address The source address to attach the consumer to, must not be <code>null</code>
 * @param messageHandler The message handler, must not be <code>null</code>
 * @return [AmqpReceiver]
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqp.AmqpClient] using Vert.x codegen.
 */
suspend fun AmqpClient.createReceiverAwait(address: String, messageHandler: (AmqpMessage) -> Unit): AmqpReceiver {
  return awaitResult {
    this.createReceiver(address, messageHandler, it::handle)
  }
}

/**
 * Suspending version of method [io.vertx.amqp.AmqpClient.createReceiver]
 *
 * @param address The source address to attach the consumer to.
 * @param receiverOptions The options for this receiver.
 * @param messageHandler The message handler, must not be <code>null</code>
 * @return [AmqpReceiver]
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqp.AmqpClient] using Vert.x codegen.
 */
suspend fun AmqpClient.createReceiverAwait(address: String, receiverOptions: AmqpReceiverOptions, messageHandler: (AmqpMessage) -> Unit): AmqpReceiver {
  return awaitResult {
    this.createReceiver(address, receiverOptions, messageHandler, it::handle)
  }
}

/**
 * Suspending version of method [io.vertx.amqp.AmqpClient.createSender]
 *
 * @param address The target address to attach to, must not be <code>null</code>
 * @return [AmqpSender]
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqp.AmqpClient] using Vert.x codegen.
 */
suspend fun AmqpClient.createSenderAwait(address: String): AmqpSender {
  return awaitResult {
    this.createSender(address, it)
  }
}

/**
 * Suspending version of method [io.vertx.amqp.AmqpClient.createSender]
 *
 * @param address The target address to attach to, must not be <code>null</code>
 * @param options The options for this sender.
 * @return [AmqpSender]
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqp.AmqpClient] using Vert.x codegen.
 */
suspend fun AmqpClient.createSenderAwait(address: String, options: AmqpSenderOptions): AmqpSender {
  return awaitResult {
    this.createSender(address, options, it)
  }
}

