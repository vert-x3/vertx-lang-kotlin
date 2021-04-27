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
package io.vertx.kotlin.mssqlclient

import io.vertx.core.Vertx
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.mssqlclient.MSSQLConnectOptions
import io.vertx.mssqlclient.MSSQLConnection as MSSQLConnectionVertxAlias
import io.vertx.sqlclient.PreparedStatement

/**
 * Suspending version of method [io.vertx.mssqlclient.MSSQLConnection.prepare]
 *
 * @param s 
 * @return [PreparedStatement]
 *
 * NOTE: This function has been automatically generated from [io.vertx.mssqlclient.MSSQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use prepare returning a future and chain with await()", replaceWith = ReplaceWith("prepare(s).await()"))
suspend fun MSSQLConnectionVertxAlias.prepareAwait(s: String): PreparedStatement {
  return awaitResult {
    this.prepare(s, it)
  }
}

object MSSQLConnection {
  /**
   * Suspending version of method [io.vertx.mssqlclient.MSSQLConnection.connect]
   *
   * @param vertx the vertx instance
   * @param connectOptions the options for the connection
   * @return [MSSQLConnectionVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.mssqlclient.MSSQLConnection] using Vert.x codegen.
   */
  @Deprecated(message = "Instead use connect returning a future and chain with await()", replaceWith = ReplaceWith("connect(vertx, connectOptions).await()"))
  suspend fun connectAwait(vertx: Vertx, connectOptions: MSSQLConnectOptions): MSSQLConnectionVertxAlias {
    return awaitResult {
      MSSQLConnectionVertxAlias.connect(vertx, connectOptions, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.mssqlclient.MSSQLConnection.connect]
   *
   * @param vertx 
   * @param connectionUri 
   * @return [MSSQLConnectionVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.mssqlclient.MSSQLConnection] using Vert.x codegen.
   */
  @Deprecated(message = "Instead use connect returning a future and chain with await()", replaceWith = ReplaceWith("connect(vertx, connectionUri).await()"))
  suspend fun connectAwait(vertx: Vertx, connectionUri: String): MSSQLConnectionVertxAlias {
    return awaitResult {
      MSSQLConnectionVertxAlias.connect(vertx, connectionUri, it)
    }
  }

}
