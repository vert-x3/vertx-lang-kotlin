/*
 * Copyright 2023 Red Hat, Inc.
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

import io.vertx.core.eventbus.EventBus
import io.vertx.core.eventbus.Message
import io.vertx.core.eventbus.MessageConsumer
import io.vertx.core.eventbus.ReplyFailure.RECIPIENT_FAILURE
import io.vertx.core.internal.ContextInternal
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

/**
 * Calls the specified function [block] with a [CoroutineEventBusSupport] object as its receiver.
 *
 * The receiver's scope is the [CoroutineScope] of the caller.
 */
fun CoroutineScope.coroutineEventBus(block: CoroutineEventBusSupport.() -> Unit) {
  val receiver = object : CoroutineEventBusSupport {
    override val coroutineContext = this@coroutineEventBus.coroutineContext
  }
  with(receiver) {
    block()
  }
}

/**
 * Adds support for suspending functions to the Vert.x [EventBus].
 *
 * Objects of this type implement [CoroutineScope] to define a scope for new coroutines.
 * Typically, this is the scope of a [CoroutineVerticle].
 */
interface CoroutineEventBusSupport : CoroutineScope {

  /**
   * Similar to [EventBus.consumer] but using a suspending [handler].
   *
   * The coroutine context is inherited from the [CoroutineScope].
   * Additional context elements can be specified with the [context] argument.
   *
   * @param context additional context elements, [EmptyCoroutineContext] by default
   */
  fun <T> EventBus.coConsumer(
    address: String,
    context: CoroutineContext = EmptyCoroutineContext,
    handler: suspend (Message<T>) -> Unit
  ): MessageConsumer<T> = consumer<T>(address).coHandler(context, handler)

  /**
   * Similar to [MessageConsumer.handler] but using a suspending [handler].
   *
   * The coroutine context is inherited from the [CoroutineScope].
   * Additional context elements can be specified with the [context] argument.
   *
   * @param context additional context elements, [EmptyCoroutineContext] by default
   */
  fun <T> MessageConsumer<T>.coHandler(
    context: CoroutineContext = EmptyCoroutineContext,
    handler: suspend (Message<T>) -> Unit
  ): MessageConsumer<T> = handler {
    launch((ContextInternal.current()?.dispatcher() ?: EmptyCoroutineContext) + context) {
      try {
        handler(it)
      } catch (e: Exception) {
        it.fail(RECIPIENT_FAILURE.toInt(), e.message)
      }
    }
  }
}
