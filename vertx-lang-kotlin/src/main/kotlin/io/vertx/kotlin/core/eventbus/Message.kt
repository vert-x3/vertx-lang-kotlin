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

import io.vertx.core.eventbus.DeliveryOptions
import io.vertx.core.eventbus.Message
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.eventbus.Message.reply]
 *
 * @param message the message to reply with.
 * @return [Message<R>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.eventbus.Message] using Vert.x codegen.
 */
suspend fun <R,T> Message<T>.replyAwait(message: Any): Message<R> {
  return awaitResult {
    this.reply(message, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.eventbus.Message.reply]
 *
 * @param message the reply message
 * @param options the delivery options
 * @return [Message<R>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.eventbus.Message] using Vert.x codegen.
 */
suspend fun <R,T> Message<T>.replyAwait(message: Any, options: DeliveryOptions): Message<R> {
  return awaitResult {
    this.reply(message, options, it)
  }
}

