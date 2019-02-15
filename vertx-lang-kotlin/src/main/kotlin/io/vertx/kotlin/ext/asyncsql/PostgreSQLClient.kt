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
package io.vertx.kotlin.ext.asyncsql

import io.vertx.core.json.JsonArray
import io.vertx.ext.asyncsql.PostgreSQLClient
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.asyncsql.PostgreSQLClient.querySingle]
 *
 * @param sql the statement to execute
 * @return [JsonArray?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.asyncsql.PostgreSQLClient] using Vert.x codegen.
 */
suspend fun PostgreSQLClient.querySingleAwait(sql: String): JsonArray? {
  return awaitResult {
    this.querySingle(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.asyncsql.PostgreSQLClient.querySingleWithParams]
 *
 * @param sql the statement to execute
 * @param arguments the arguments
 * @return [JsonArray?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.asyncsql.PostgreSQLClient] using Vert.x codegen.
 */
suspend fun PostgreSQLClient.querySingleWithParamsAwait(sql: String, arguments: JsonArray): JsonArray? {
  return awaitResult {
    this.querySingleWithParams(sql, arguments, it)
  }
}

