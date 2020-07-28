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
import io.vertx.mysqlclient.MySQLAuthOptions
import io.vertx.mysqlclient.MySQLConnectOptions
import io.vertx.mysqlclient.MySQLConnection as MySQLConnectionVertxAlias
import io.vertx.mysqlclient.MySQLSetOption
import io.vertx.sqlclient.PreparedStatement

/**
 * Suspending version of method [io.vertx.mysqlclient.MySQLConnection.prepare]
 *
 * @param sql 
 * @return [PreparedStatement]
 *
 * NOTE: This function has been automatically generated from [io.vertx.mysqlclient.MySQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use prepare returning a future that can yield a result ", replaceWith = ReplaceWith("prepare(sql).await()"))
suspend fun MySQLConnectionVertxAlias.prepareAwait(sql: String): PreparedStatement {
  return awaitResult {
    this.prepare(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.mysqlclient.MySQLConnection.ping]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.mysqlclient.MySQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ping returning a future that can yield a result ", replaceWith = ReplaceWith("ping().await()"))
suspend fun MySQLConnectionVertxAlias.pingAwait(): Unit {
  return awaitResult {
    this.ping(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.mysqlclient.MySQLConnection.specifySchema]
 *
 * @param schemaName name of the schema to change to
 *
 * NOTE: This function has been automatically generated from [io.vertx.mysqlclient.MySQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use specifySchema returning a future that can yield a result ", replaceWith = ReplaceWith("specifySchema(schemaName).await()"))
suspend fun MySQLConnectionVertxAlias.specifySchemaAwait(schemaName: String): Unit {
  return awaitResult {
    this.specifySchema(schemaName, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.mysqlclient.MySQLConnection.getInternalStatistics]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.mysqlclient.MySQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getInternalStatistics returning a future that can yield a result ", replaceWith = ReplaceWith("getInternalStatistics().await()"))
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
@Deprecated(message = "Instead use setOption returning a future that can yield a result ", replaceWith = ReplaceWith("setOption(option).await()"))
suspend fun MySQLConnectionVertxAlias.setOptionAwait(option: MySQLSetOption): Unit {
  return awaitResult {
    this.setOption(option, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.mysqlclient.MySQLConnection.resetConnection]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.mysqlclient.MySQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use resetConnection returning a future that can yield a result ", replaceWith = ReplaceWith("resetConnection().await()"))
suspend fun MySQLConnectionVertxAlias.resetConnectionAwait(): Unit {
  return awaitResult {
    this.resetConnection(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.mysqlclient.MySQLConnection.debug]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.mysqlclient.MySQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use debug returning a future that can yield a result ", replaceWith = ReplaceWith("debug().await()"))
suspend fun MySQLConnectionVertxAlias.debugAwait(): Unit {
  return awaitResult {
    this.debug(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.mysqlclient.MySQLConnection.changeUser]
 *
 * @param options authentication options
 *
 * NOTE: This function has been automatically generated from [io.vertx.mysqlclient.MySQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use changeUser returning a future that can yield a result ", replaceWith = ReplaceWith("changeUser(options).await()"))
suspend fun MySQLConnectionVertxAlias.changeUserAwait(options: MySQLAuthOptions): Unit {
  return awaitResult {
    this.changeUser(options, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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
  @Deprecated(message = "Instead use connect returning a future that can yield a result ", replaceWith = ReplaceWith("connect(vertx, connectOptions).await()"))
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
  @Deprecated(message = "Instead use connect returning a future that can yield a result ", replaceWith = ReplaceWith("connect(vertx, connectionUri).await()"))
  suspend fun connectAwait(vertx: Vertx, connectionUri: String): MySQLConnectionVertxAlias {
    return awaitResult {
      MySQLConnectionVertxAlias.connect(vertx, connectionUri, it)
    }
  }

}
