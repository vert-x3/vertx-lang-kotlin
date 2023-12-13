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

import io.vertx.core.WorkerExecutor
import io.vertx.kotlin.coroutines.awaitResult
import java.util.concurrent.Callable

/**
 * Suspending version of method [io.vertx.core.WorkerExecutor.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.WorkerExecutor] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with await()", replaceWith = ReplaceWith("close().await()"))
suspend fun WorkerExecutor.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.WorkerExecutor.executeBlocking]
 *
 * @param blockingCodeHandler 
 * @return [T?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.WorkerExecutor] using Vert.x codegen.
 */
@Deprecated(message = "Instead use executeBlocking returning a future and chain with await()", replaceWith = ReplaceWith("executeBlocking(blockingCodeHandler).await()"))
suspend fun <T> WorkerExecutor.executeBlockingAwait(blockingCodeHandler: Callable<T>): T? {
  return awaitResult {
    this.executeBlocking(blockingCodeHandler, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.WorkerExecutor.executeBlocking]
 *
 * @param blockingCodeHandler 
 * @param ordered 
 * @return [T?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.WorkerExecutor] using Vert.x codegen.
 */
@Deprecated(message = "Instead use executeBlocking returning a future and chain with await()", replaceWith = ReplaceWith("executeBlocking(blockingCodeHandler, ordered).await()"))
suspend fun <T> WorkerExecutor.executeBlockingAwait(blockingCodeHandler: Callable<T>, ordered: Boolean): T? {
  return awaitResult {
    this.executeBlocking(blockingCodeHandler, ordered, it)
  }
}

