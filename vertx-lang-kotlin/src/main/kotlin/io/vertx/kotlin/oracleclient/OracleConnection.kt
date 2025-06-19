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
package io.vertx.kotlin.oracleclient

import io.vertx.core.Vertx
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.oracleclient.OracleConnectOptions
import io.vertx.oracleclient.OracleConnection as OracleConnectionVertxAlias
import io.vertx.sqlclient.PreparedStatement

/**
 * Suspending version of method [io.vertx.oracleclient.OracleConnection.prepare]
 *
 * @param s 
 * @return [PreparedStatement]
 *
 * NOTE: This function has been automatically generated from [io.vertx.oracleclient.OracleConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use prepare returning a future and chain with coAwait()", replaceWith = ReplaceWith("prepare(s).coAwait()"))
suspend fun OracleConnectionVertxAlias.prepareAwait(s: String): PreparedStatement {
  return awaitResult {
    this.prepare(s, it)
  }
}

object OracleConnection {
  /**
   * Suspending version of method [io.vertx.oracleclient.OracleConnection.connect]
   *
   * @param vertx the vertx instance
   * @param connectOptions the options for the connection
   * @return [OracleConnectionVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.oracleclient.OracleConnection] using Vert.x codegen.
   */
  @Deprecated(message = "Instead use connect returning a future and chain with coAwait()", replaceWith = ReplaceWith("connect(vertx, connectOptions).coAwait()"))
  suspend fun connectAwait(vertx: Vertx, connectOptions: OracleConnectOptions): OracleConnectionVertxAlias {
    return awaitResult {
      OracleConnectionVertxAlias.connect(vertx, connectOptions, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.oracleclient.OracleConnection.connect]
   *
   * @param vertx 
   * @param connectionUri 
   * @return [OracleConnectionVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.oracleclient.OracleConnection] using Vert.x codegen.
   */
  @Deprecated(message = "Instead use connect returning a future and chain with coAwait()", replaceWith = ReplaceWith("connect(vertx, connectionUri).coAwait()"))
  suspend fun connectAwait(vertx: Vertx, connectionUri: String): OracleConnectionVertxAlias {
    return awaitResult {
      OracleConnectionVertxAlias.connect(vertx, connectionUri, it)
    }
  }

}
