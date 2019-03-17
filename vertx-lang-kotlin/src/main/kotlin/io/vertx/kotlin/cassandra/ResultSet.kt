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
 *
 * @return  *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.ResultSet original] using Vert.x codegen.
 */
suspend fun ResultSet.fetchMoreResultsAwait() : Unit {
  return awaitResult{
    this.fetchMoreResults({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * The method should <strong>not</strong> be used concurrently with others like [io.vertx.cassandra.ResultSet] or [io.vertx.cassandra.ResultSet].
 * This may lead to unexpected result.
 *
 * @return  *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.ResultSet original] using Vert.x codegen.
 */
suspend fun ResultSet.oneAwait() : Row? {
  return awaitResult{
    this.one(it)
  }
}

/**
 * Fetch a specific amount of rows and notify via a handler.
 * <p>
 * If remaining amount of rows in a result set is less than desired amount of rows to fetch,
 * the <code>handler</code> will be called with a successful result encompassing just the remaining rows.
 *
 * <p>
 * The method should <strong>not</strong> be used concurrently with others like [io.vertx.cassandra.ResultSet] or [io.vertx.cassandra.ResultSet].
 * This may lead to unexpected result.
 *
 * @param amount the amount
 * @return  *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.ResultSet original] using Vert.x codegen.
 */
suspend fun ResultSet.severalAwait(amount : Int) : List<Row> {
  return awaitResult{
    this.several(amount, it)
  }
}

/**
 * The method should <strong>not</strong> be used concurrently with others like [io.vertx.cassandra.ResultSet] or [io.vertx.cassandra.ResultSet].
 * This may lead to unexpected result.
 *
 * @return  *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.ResultSet original] using Vert.x codegen.
 */
suspend fun ResultSet.allAwait() : List<Row> {
  return awaitResult{
    this.all(it)
  }
}

