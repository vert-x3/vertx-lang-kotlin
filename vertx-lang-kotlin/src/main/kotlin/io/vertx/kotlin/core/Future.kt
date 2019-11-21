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
package io.vertx.kotlin.core

import io.vertx.core.Future
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.Future.setHandler]
 *
 * @return [T]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.Future] using Vert.x codegen.
 */
suspend fun <T> Future<T>.setHandlerAwait(): T {
  return awaitResult {
    this.setHandler(it)
  }
}

/**
 * Suspending version of method [io.vertx.core.Future.onComplete]
 *
 * @return [T]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.Future] using Vert.x codegen.
 */
suspend fun <T> Future<T>.onCompleteAwait(): T {
  return awaitResult {
    this.onComplete(it)
  }
}

