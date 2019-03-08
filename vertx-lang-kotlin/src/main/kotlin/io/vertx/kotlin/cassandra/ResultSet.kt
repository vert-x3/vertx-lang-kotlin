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

import com.datastax.driver.core.Row
import io.vertx.cassandra.ResultSet
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.cassandra.ResultSet.fetchMoreResults]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.ResultSet] using Vert.x codegen.
 */
suspend fun ResultSet.fetchMoreResultsAwait(): Unit {
  return awaitResult {
    this.fetchMoreResults { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.cassandra.ResultSet.one]
 *
 * @return [Row?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.ResultSet] using Vert.x codegen.
 */
suspend fun ResultSet.oneAwait(): Row? {
  return awaitResult {
    this.one(it)
  }
}

/**
 * Suspending version of method [io.vertx.cassandra.ResultSet.all]
 *
 * @return [List<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.ResultSet] using Vert.x codegen.
 */
suspend fun ResultSet.allAwait(): List<Row> {
  return awaitResult {
    this.all(it)
  }
}

