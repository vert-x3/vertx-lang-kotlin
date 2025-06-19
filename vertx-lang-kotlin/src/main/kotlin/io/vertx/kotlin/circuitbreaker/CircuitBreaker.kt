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
import io.vertx.core.Promise
import io.vertx.kotlin.coroutines.awaitResult
import java.util.function.Function

/**
 * Suspending version of method [io.vertx.circuitbreaker.CircuitBreaker.executeWithFallback]
 *
 * @param command the operation
 * @param fallback the fallback
 * @return [T]
 *
 * NOTE: This function has been automatically generated from [io.vertx.circuitbreaker.CircuitBreaker] using Vert.x codegen.
 */
@Deprecated(message = "Instead use executeWithFallback returning a future and chain with coAwait()", replaceWith = ReplaceWith("executeWithFallback(command, fallback).coAwait()"))
suspend fun <T> CircuitBreaker.executeWithFallbackAwait(command: (Promise<T>) -> Unit, fallback: (Throwable) -> T): T {
  return awaitResult {
    this.executeWithFallback(command, fallback, it::handle)
  }
}

/**
 * Suspending version of method [io.vertx.circuitbreaker.CircuitBreaker.execute]
 *
 * @param command the operation
 * @return [T]
 *
 * NOTE: This function has been automatically generated from [io.vertx.circuitbreaker.CircuitBreaker] using Vert.x codegen.
 */
@Deprecated(message = "Instead use execute returning a future and chain with coAwait()", replaceWith = ReplaceWith("execute(command).coAwait()"))
suspend fun <T> CircuitBreaker.executeAwait(command: (Promise<T>) -> Unit): T {
  return awaitResult {
    this.execute(command, it::handle)
  }
}

