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

import io.vertx.core.Vertx
import io.vertx.core.eventbus.EventBus
import io.vertx.core.eventbus.Message
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


fun Vertx.coEventBus(): CoroutineEventBus {
  return CoroutineEventBusImpl(this)
}

abstract class CoroutineEventBus(protected val eventBus: EventBus) : EventBus by eventBus {
  abstract fun <T> consumer(address: String, function: suspend (Message<T>) -> Unit): CoroutineMessageConsumer<T>
  abstract override fun <T> consumer(address: String): CoroutineMessageConsumer<T>
}

class CoroutineEventBusImpl(vertx: Vertx) : CoroutineEventBus(vertx.eventBus()) {

  private val scope = CoroutineScope(vertx.dispatcher())

  override fun <T> consumer(address: String): CoroutineMessageConsumer<T> {
    return CoroutineMessageConsumerImpl(scope, eventBus.consumer(address))
  }

  override fun <T> consumer(address: String, function: suspend (Message<T>) -> Unit): CoroutineMessageConsumer<T> {
    return CoroutineMessageConsumerImpl(scope, eventBus.consumer(address) {
      scope.launch {
        function(it)
      }
    })
  }
}
