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
import io.vertx.core.WorkerExecutor
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.WorkerExecutor.executeBlocking]
 *
 * @param blockingCodeHandler handler representing the blocking code to run
 * @param ordered if true then if executeBlocking is called several times on the same context, the executions for that context will be executed serially, not in parallel. if false then they will be no ordering guarantees
 * @return [T?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.WorkerExecutor] using Vert.x codegen.
 */
suspend fun <T> WorkerExecutor.executeBlockingAwait(blockingCodeHandler: (Future<T>) -> Unit, ordered: Boolean): T? {
  return awaitResult {
    this.executeBlocking(blockingCodeHandler, ordered, it::handle)
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
suspend fun <T> WorkerExecutor.executeBlockingAwait(blockingCodeHandler: (Future<T>) -> Unit): T? {
  return awaitResult {
    this.executeBlocking(blockingCodeHandler, it::handle)
  }
}

