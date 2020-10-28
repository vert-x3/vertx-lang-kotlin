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

import io.vertx.core.eventbus.Message
import io.vertx.core.eventbus.MessageConsumer
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

/**
 * Proxy around Vert.x [MessageConsumer] that provides support for suspending functions
 *
 * @author [Alexey Soshin](https://github.com/alexeysoshin)
 */
abstract class CoroutineMessageConsumer<T>(consumer: MessageConsumer<T>) : MessageConsumer<T> by consumer {
  abstract fun handler(function: suspend (Message<T>) -> Unit): CoroutineMessageConsumer<T>
}

class CoroutineMessageConsumerImpl<T>(private val scope: CoroutineScope,
                                      private val consumer: MessageConsumer<T>) : CoroutineMessageConsumer<T>(consumer) {
  override fun handler(function: suspend (Message<T>) -> Unit) = apply {
    consumer.handler { message ->
      scope.launch {
        function(message)
      }
    }
  }
}
