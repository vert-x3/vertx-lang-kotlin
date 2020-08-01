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
package io.vertx.kotlin.db2client

import io.vertx.core.Vertx
import io.vertx.db2client.DB2ConnectOptions
import io.vertx.db2client.DB2Connection as DB2ConnectionVertxAlias
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.sqlclient.PreparedStatement

@Deprecated(message = "Instead use prepare returning a future and chain with await()", replaceWith = ReplaceWith("prepare(sql).await()"))
suspend fun DB2ConnectionVertxAlias.prepareAwait(sql: String): PreparedStatement {
  return awaitResult {
    this.prepare(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.db2client.DB2Connection.ping]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.db2client.DB2Connection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ping returning a future and chain with await()", replaceWith = ReplaceWith("ping().await()"))
suspend fun DB2ConnectionVertxAlias.pingAwait(): Unit {
  return awaitResult {
    this.ping(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.db2client.DB2Connection.debug]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.db2client.DB2Connection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use debug returning a future and chain with await()", replaceWith = ReplaceWith("debug().await()"))
suspend fun DB2ConnectionVertxAlias.debugAwait(): Unit {
  return awaitResult {
    this.debug(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

object DB2Connection {
  /**
   * Suspending version of method [io.vertx.db2client.DB2Connection.connect]
   *
   * @param vertx the vertx instance
   * @param connectOptions the options for the connection
   * @return [DB2ConnectionVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.db2client.DB2Connection] using Vert.x codegen.
   */
  @Deprecated(message = "Instead use connect returning a future and chain with await()", replaceWith = ReplaceWith("connect(vertx, connectOptions).await()"))
  suspend fun connectAwait(vertx: Vertx, connectOptions: DB2ConnectOptions): DB2ConnectionVertxAlias {
    return awaitResult {
      DB2ConnectionVertxAlias.connect(vertx, connectOptions, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.db2client.DB2Connection.connect]
   *
   * @param vertx 
   * @param connectionUri 
   * @return [DB2ConnectionVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.db2client.DB2Connection] using Vert.x codegen.
   */
  @Deprecated(message = "Instead use connect returning a future and chain with await()", replaceWith = ReplaceWith("connect(vertx, connectionUri).await()"))
  suspend fun connectAwait(vertx: Vertx, connectionUri: String): DB2ConnectionVertxAlias {
    return awaitResult {
      DB2ConnectionVertxAlias.connect(vertx, connectionUri, it)
    }
  }

}
