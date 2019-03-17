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
import io.vertx.core.eventbus.EventBus
import io.vertx.core.eventbus.Message
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Like [io.vertx.core.eventbus.EventBus] but specifying a <code>replyHandler</code> that will be called if the recipient
 * subsequently replies to the message.
 *
 * @param address the address to send it to
 * @param message the message, may be <code>null</code>
 * @return a reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.eventbus.EventBus original] using Vert.x codegen.
 */
suspend fun <T> EventBus.sendAwait(address : String, message : Any) : Message<T> {
  return awaitResult{
    this.send(address, message, it)
  }
}

/**
 * Like [io.vertx.core.eventbus.EventBus] but specifying a <code>replyHandler</code> that will be called if the recipient
 * subsequently replies to the message.
 *
 * @param address the address to send it to
 * @param message the message, may be <code>null</code>
 * @param options delivery options
 * @return a reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.eventbus.EventBus original] using Vert.x codegen.
 */
suspend fun <T> EventBus.sendAwait(address : String, message : Any, options : DeliveryOptions) : Message<T> {
  return awaitResult{
    this.send(address, message, options, it)
  }
}

