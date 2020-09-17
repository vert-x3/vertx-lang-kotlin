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
import io.vertx.sqlclient.Query

/**
 * Suspending version of method [io.vertx.sqlclient.Query.execute]
 *
 * @return [T]
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.Query] using Vert.x codegen.
 */
@Deprecated(message = "Instead use execute returning a future and chain with await()", replaceWith = ReplaceWith("execute().await()"))
suspend fun <T> Query<T>.executeAwait(): T {
  return awaitResult {
    this.execute(it)
  }
}

