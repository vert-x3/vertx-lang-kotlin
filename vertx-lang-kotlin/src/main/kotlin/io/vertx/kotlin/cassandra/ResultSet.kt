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
package io.vertx.kotlin.cassandra

import com.datastax.oss.driver.api.core.cql.Row
import io.vertx.cassandra.ResultSet
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.cassandra.ResultSet.fetchNextPage]
 *
 * @return [ResultSet]
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.ResultSet] using Vert.x codegen.
 */
@Deprecated(message = "Instead use fetchNextPage returning a future and chain with coAwait()", replaceWith = ReplaceWith("fetchNextPage().coAwait()"))
suspend fun ResultSet.fetchNextPageAwait(): ResultSet {
  return awaitResult {
    this.fetchNextPage(it)
  }
}

/**
 * Suspending version of method [io.vertx.cassandra.ResultSet.all]
 *
 * @return [List<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.ResultSet] using Vert.x codegen.
 */
@Deprecated(message = "Instead use all returning a future and chain with coAwait()", replaceWith = ReplaceWith("all().coAwait()"))
suspend fun ResultSet.allAwait(): List<Row> {
  return awaitResult {
    this.all(it)
  }
}

