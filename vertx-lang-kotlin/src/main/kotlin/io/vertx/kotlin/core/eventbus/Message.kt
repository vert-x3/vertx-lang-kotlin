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
 * The same as <code>reply(R message)</code> but you can specify handler for the reply - i.e.
 * to receive the reply to the reply.
 *
 * @param message the message to reply with.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.eventbus.Message original] using Vert.x codegen.
 */
suspend fun <R,T> Message<T>.replyAwait(message : Any) : Message<R> {
  return awaitResult{
    this.reply(message, it)
  }
}

/**
 * The same as <code>reply(R message, DeliveryOptions)</code> but you can specify handler for the reply - i.e.
 * to receive the reply to the reply.
 *
 * @param message the reply message
 * @param options the delivery options
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.eventbus.Message original] using Vert.x codegen.
 */
suspend fun <R,T> Message<T>.replyAwait(message : Any, options : DeliveryOptions) : Message<R> {
  return awaitResult{
    this.reply(message, options, it)
  }
}

