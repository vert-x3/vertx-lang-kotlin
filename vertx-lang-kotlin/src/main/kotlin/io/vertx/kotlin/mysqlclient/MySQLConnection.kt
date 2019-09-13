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
package io.vertx.kotlin.mysqlclient

import io.vertx.core.Vertx
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.mysqlclient.MySQLConnectOptions
import io.vertx.mysqlclient.MySQLConnection as MySQLConnectionVertxAlias
import io.vertx.mysqlclient.MySQLSetOption
import io.vertx.sqlclient.PreparedQuery
import io.vertx.sqlclient.Row
import io.vertx.sqlclient.RowSet
import io.vertx.sqlclient.Tuple

suspend fun MySQLConnectionVertxAlias.prepareAwait(sql: String): PreparedQuery {
  return awaitResult {
    this.prepare(sql, it)
  }
}

suspend fun MySQLConnectionVertxAlias.preparedQueryAwait(sql: String): RowSet<Row> {
  return awaitResult {
    this.preparedQuery(sql, it)
  }
}

suspend fun MySQLConnectionVertxAlias.queryAwait(sql: String): RowSet<Row> {
  return awaitResult {
    this.query(sql, it)
  }
}

suspend fun MySQLConnectionVertxAlias.preparedQueryAwait(sql: String, arguments: Tuple): RowSet<Row> {
  return awaitResult {
    this.preparedQuery(sql, arguments, it)
  }
}

/**
 * Suspending version of method [io.vertx.mysqlclient.MySQLConnection.ping]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.mysqlclient.MySQLConnection] using Vert.x codegen.
 */
suspend fun MySQLConnectionVertxAlias.pingAwait(): Unit {
  return awaitResult {
    this.ping { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.mysqlclient.MySQLConnection.specifySchema]
 *
 * @param schemaName name of the schema to change to
 *
 * NOTE: This function has been automatically generated from [io.vertx.mysqlclient.MySQLConnection] using Vert.x codegen.
 */
suspend fun MySQLConnectionVertxAlias.specifySchemaAwait(schemaName: String): Unit {
  return awaitResult {
    this.specifySchema(schemaName) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.mysqlclient.MySQLConnection.getInternalStatistics]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.mysqlclient.MySQLConnection] using Vert.x codegen.
 */
suspend fun MySQLConnectionVertxAlias.getInternalStatisticsAwait(): String {
  return awaitResult {
    this.getInternalStatistics(it)
  }
}

/**
 * Suspending version of method [io.vertx.mysqlclient.MySQLConnection.setOption]
 *
 * @param option the options to set
 *
 * NOTE: This function has been automatically generated from [io.vertx.mysqlclient.MySQLConnection] using Vert.x codegen.
 */
suspend fun MySQLConnectionVertxAlias.setOptionAwait(option: MySQLSetOption): Unit {
  return awaitResult {
    this.setOption(option) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.mysqlclient.MySQLConnection.resetConnection]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.mysqlclient.MySQLConnection] using Vert.x codegen.
 */
suspend fun MySQLConnectionVertxAlias.resetConnectionAwait(): Unit {
  return awaitResult {
    this.resetConnection { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.mysqlclient.MySQLConnection.debug]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.mysqlclient.MySQLConnection] using Vert.x codegen.
 */
suspend fun MySQLConnectionVertxAlias.debugAwait(): Unit {
  return awaitResult {
    this.debug { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.mysqlclient.MySQLConnection.changeUser]
 *
 * @param options authentication options, only username, password, database, collation and properties will be used.
 *
 * NOTE: This function has been automatically generated from [io.vertx.mysqlclient.MySQLConnection] using Vert.x codegen.
 */
suspend fun MySQLConnectionVertxAlias.changeUserAwait(options: MySQLConnectOptions): Unit {
  return awaitResult {
    this.changeUser(options) { ar -> it.handle(ar.mapEmpty()) }
  }
}

object MySQLConnection {
  /**
   * Suspending version of method [io.vertx.mysqlclient.MySQLConnection.connect]
   *
   * @param vertx the vertx instance
   * @param connectOptions the options for the connection
   * @return [MySQLConnectionVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.mysqlclient.MySQLConnection] using Vert.x codegen.
   */
  suspend fun connectAwait(vertx: Vertx, connectOptions: MySQLConnectOptions): MySQLConnectionVertxAlias {
    return awaitResult {
      MySQLConnectionVertxAlias.connect(vertx, connectOptions, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.mysqlclient.MySQLConnection.connect]
   *
   * @param vertx 
   * @param connectionUri 
   * @return [MySQLConnectionVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.mysqlclient.MySQLConnection] using Vert.x codegen.
   */
  suspend fun connectAwait(vertx: Vertx, connectionUri: String): MySQLConnectionVertxAlias {
    return awaitResult {
      MySQLConnectionVertxAlias.connect(vertx, connectionUri, it)
    }
  }

}
