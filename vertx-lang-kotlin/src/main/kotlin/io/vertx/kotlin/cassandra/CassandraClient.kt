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

import com.datastax.oss.driver.api.core.cql.PreparedStatement
import com.datastax.oss.driver.api.core.cql.Row
import com.datastax.oss.driver.api.core.cql.SimpleStatement
import com.datastax.oss.driver.api.core.cql.Statement
import io.vertx.cassandra.CassandraClient
import io.vertx.cassandra.CassandraRowStream
import io.vertx.cassandra.ResultSet
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.cassandra.CassandraClient.execute]
 *
 * @param query the query to execute
 * @return [ResultSet]
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.CassandraClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use execute returning a future and chain with await()", replaceWith = ReplaceWith("execute(query).await()"))
suspend fun CassandraClient.executeAwait(query: String): ResultSet {
  return awaitResult {
    this.execute(query, it)
  }
}

/**
 * Suspending version of method [io.vertx.cassandra.CassandraClient.queryStream]
 *
 * @param sql the SQL to execute. For example <code>SELECT * FROM table ...</code>.
 * @return [CassandraRowStream]
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.CassandraClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use queryStream returning a future and chain with await()", replaceWith = ReplaceWith("queryStream(sql).await()"))
suspend fun CassandraClient.queryStreamAwait(sql: String): CassandraRowStream {
  return awaitResult {
    this.queryStream(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.cassandra.CassandraClient.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.CassandraClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with await()", replaceWith = ReplaceWith("close().await()"))
suspend fun CassandraClient.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.cassandra.CassandraClient.executeWithFullFetch]
 *
 * @param query the query to execute
 * @return [List<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.CassandraClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use executeWithFullFetch returning a future and chain with await()", replaceWith = ReplaceWith("executeWithFullFetch(query).await()"))
suspend fun CassandraClient.executeWithFullFetchAwait(query: String): List<Row> {
  return awaitResult {
    this.executeWithFullFetch(query, it)
  }
}

/**
 * Suspending version of method [io.vertx.cassandra.CassandraClient.executeWithFullFetch]
 *
 * @param statement the statement to execute
 * @return [List<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.CassandraClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use executeWithFullFetch returning a future and chain with await()", replaceWith = ReplaceWith("executeWithFullFetch(statement).await()"))
suspend fun CassandraClient.executeWithFullFetchAwait(statement: Statement<*>): List<Row> {
  return awaitResult {
    this.executeWithFullFetch(statement, it)
  }
}

/**
 * Suspending version of method [io.vertx.cassandra.CassandraClient.execute]
 *
 * @param statement the statement to execute
 * @return [ResultSet]
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.CassandraClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use execute returning a future and chain with await()", replaceWith = ReplaceWith("execute(statement).await()"))
suspend fun CassandraClient.executeAwait(statement: Statement<*>): ResultSet {
  return awaitResult {
    this.execute(statement, it)
  }
}

/**
 * Suspending version of method [io.vertx.cassandra.CassandraClient.prepare]
 *
 * @param query the query to prepare
 * @return [PreparedStatement]
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.CassandraClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use prepare returning a future and chain with await()", replaceWith = ReplaceWith("prepare(query).await()"))
suspend fun CassandraClient.prepareAwait(query: String): PreparedStatement {
  return awaitResult {
    this.prepare(query, it)
  }
}

/**
 * Suspending version of method [io.vertx.cassandra.CassandraClient.prepare]
 *
 * @param statement the statement to prepare
 * @return [PreparedStatement]
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.CassandraClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use prepare returning a future and chain with await()", replaceWith = ReplaceWith("prepare(statement).await()"))
suspend fun CassandraClient.prepareAwait(statement: SimpleStatement): PreparedStatement {
  return awaitResult {
    this.prepare(statement, it)
  }
}

/**
 * Suspending version of method [io.vertx.cassandra.CassandraClient.queryStream]
 *
 * @param statement the statement to execute.
 * @return [CassandraRowStream]
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.CassandraClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use queryStream returning a future and chain with await()", replaceWith = ReplaceWith("queryStream(statement).await()"))
suspend fun CassandraClient.queryStreamAwait(statement: Statement<*>): CassandraRowStream {
  return awaitResult {
    this.queryStream(statement, it)
  }
}

