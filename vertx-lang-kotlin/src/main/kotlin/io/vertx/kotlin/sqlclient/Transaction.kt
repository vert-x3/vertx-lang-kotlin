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
package io.vertx.kotlin.sqlclient

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.sqlclient.Transaction

/**
 * Suspending version of method [io.vertx.sqlclient.Transaction.commit]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.Transaction] using Vert.x codegen.
 */
@Deprecated(message = "Instead use commit returning a future and chain with await()", replaceWith = ReplaceWith("commit().await()"))
suspend fun Transaction.commitAwait(): Unit {
  return awaitResult {
    this.commit(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.sqlclient.Transaction.rollback]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.Transaction] using Vert.x codegen.
 */
@Deprecated(message = "Instead use rollback returning a future and chain with await()", replaceWith = ReplaceWith("rollback().await()"))
suspend fun Transaction.rollbackAwait(): Unit {
  return awaitResult {
    this.rollback(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

