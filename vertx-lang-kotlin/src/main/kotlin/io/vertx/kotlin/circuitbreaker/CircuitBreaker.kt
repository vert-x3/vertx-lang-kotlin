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
package io.vertx.kotlin.circuitbreaker

import io.vertx.circuitbreaker.CircuitBreaker
import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.kotlin.coroutines.awaitResult
import java.util.function.Function

/**
 * Same as [io.vertx.circuitbreaker.CircuitBreaker] but using a callback.
 *
 * @param command the operation
 * @param fallback the fallback
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.circuitbreaker.CircuitBreaker original] using Vert.x codegen.
 */
suspend fun <T> CircuitBreaker.executeCommandWithFallbackAwait(command : Handler<Future<T>>, fallback : Function<Throwable,T>) : T {
  return awaitResult{
    this.executeCommandWithFallback(command, fallback, it)
  }
}

/**
 * Same as [io.vertx.circuitbreaker.CircuitBreaker] but using the circuit breaker default fallback.
 *
 * @param command the operation
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.circuitbreaker.CircuitBreaker original] using Vert.x codegen.
 */
suspend fun <T> CircuitBreaker.executeCommandAwait(command : Handler<Future<T>>) : T {
  return awaitResult{
    this.executeCommand(command, it)
  }
}

