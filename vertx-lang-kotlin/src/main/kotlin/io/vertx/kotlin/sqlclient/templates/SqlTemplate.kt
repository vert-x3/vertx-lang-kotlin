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
package io.vertx.kotlin.sqlclient.templates

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.sqlclient.templates.SqlTemplate

/**
 * Suspending version of method [io.vertx.sqlclient.templates.SqlTemplate.execute]
 *
 * @param parameters the query parameters
 * @return [R]
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.templates.SqlTemplate] using Vert.x codegen.
 */
@Deprecated(message = "Instead use execute returning a future and chain with await()", replaceWith = ReplaceWith("execute(parameters).await()"))
suspend fun <I,R> SqlTemplate<I,R>.executeAwait(parameters: I): R {
  return awaitResult {
    this.execute(parameters, it)
  }
}

/**
 * Suspending version of method [io.vertx.sqlclient.templates.SqlTemplate.executeBatch]
 *
 * @param batch the batch
 * @return [R]
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.templates.SqlTemplate] using Vert.x codegen.
 */
@Deprecated(message = "Instead use executeBatch returning a future and chain with await()", replaceWith = ReplaceWith("executeBatch(batch).await()"))
suspend fun <I,R> SqlTemplate<I,R>.executeBatchAwait(batch: List<I>): R {
  return awaitResult {
    this.executeBatch(batch, it)
  }
}

