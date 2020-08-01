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
package io.vertx.kotlin.pgclient

import io.vertx.core.Vertx
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.pgclient.PgConnectOptions
import io.vertx.pgclient.PgConnection as PgConnectionVertxAlias
import io.vertx.sqlclient.PreparedStatement

/**
 * Suspending version of method [io.vertx.pgclient.PgConnection.prepare]
 *
 * @param sql 
 * @return [PreparedStatement]
 *
 * NOTE: This function has been automatically generated from [io.vertx.pgclient.PgConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use prepare returning a future and chain with await()", replaceWith = ReplaceWith("prepare(sql).await()"))
suspend fun PgConnectionVertxAlias.prepareAwait(sql: String): PreparedStatement {
  return awaitResult {
    this.prepare(sql, it)
  }
}

object PgConnection {
  /**
   * Suspending version of method [io.vertx.pgclient.PgConnection.connect]
   *
   * @param vertx the vertx instance
   * @param options the connect options
   * @return [PgConnectionVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.pgclient.PgConnection] using Vert.x codegen.
   */
  @Deprecated(message = "Instead use connect returning a future and chain with await()", replaceWith = ReplaceWith("connect(vertx, options).await()"))
  suspend fun connectAwait(vertx: Vertx, options: PgConnectOptions): PgConnectionVertxAlias {
    return awaitResult {
      PgConnectionVertxAlias.connect(vertx, options, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.pgclient.PgConnection.connect]
   *
   * @param vertx 
   * @return [PgConnectionVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.pgclient.PgConnection] using Vert.x codegen.
   */
  @Deprecated(message = "Instead use connect returning a future and chain with await()", replaceWith = ReplaceWith("connect(vertx).await()"))
  suspend fun connectAwait(vertx: Vertx): PgConnectionVertxAlias {
    return awaitResult {
      PgConnectionVertxAlias.connect(vertx, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.pgclient.PgConnection.connect]
   *
   * @param vertx 
   * @param connectionUri 
   * @return [PgConnectionVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.pgclient.PgConnection] using Vert.x codegen.
   */
  @Deprecated(message = "Instead use connect returning a future and chain with await()", replaceWith = ReplaceWith("connect(vertx, connectionUri).await()"))
  suspend fun connectAwait(vertx: Vertx, connectionUri: String): PgConnectionVertxAlias {
    return awaitResult {
      PgConnectionVertxAlias.connect(vertx, connectionUri, it)
    }
  }

}
