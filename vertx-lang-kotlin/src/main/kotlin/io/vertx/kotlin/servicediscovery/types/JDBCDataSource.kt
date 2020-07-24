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
package io.vertx.kotlin.servicediscovery.types

import io.vertx.core.json.JsonObject
import io.vertx.ext.jdbc.JDBCClient
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import io.vertx.servicediscovery.types.JDBCDataSource as JDBCDataSourceVertxAlias
import java.util.function.Function

object JDBCDataSource {
  /**
   * Suspending version of method [io.vertx.servicediscovery.types.JDBCDataSource.getJDBCClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter, optional
   * @return [JDBCClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.JDBCDataSource] using Vert.x codegen.
   */
  @Deprecated(message = "Instead use getJDBCClient returning a future that can yield a result ", replaceWith = ReplaceWith("getJDBCClient(discovery, filter).await()"))
  suspend fun getJDBCClientAwait(discovery: ServiceDiscovery, filter: JsonObject): JDBCClient {
    return awaitResult {
      JDBCDataSourceVertxAlias.getJDBCClient(discovery, filter, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.servicediscovery.types.JDBCDataSource.getJDBCClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter (must not be <code>null</code>)
   * @return [JDBCClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.JDBCDataSource] using Vert.x codegen.
   */
  @Deprecated(message = "Instead use getJDBCClient returning a future that can yield a result ", replaceWith = ReplaceWith("getJDBCClient(discovery, filter).await()"))
  suspend fun getJDBCClientAwait(discovery: ServiceDiscovery, filter: (Record) -> Boolean): JDBCClient {
    return awaitResult {
      JDBCDataSourceVertxAlias.getJDBCClient(discovery, filter, it::handle)
    }
  }

  /**
   * Suspending version of method [io.vertx.servicediscovery.types.JDBCDataSource.getJDBCClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter, optional
   * @param consumerConfiguration the consumer configuration
   * @return [JDBCClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.JDBCDataSource] using Vert.x codegen.
   */
  @Deprecated(message = "Instead use getJDBCClient returning a future that can yield a result ", replaceWith = ReplaceWith("getJDBCClient(discovery, filter, consumerConfiguration).await()"))
  suspend fun getJDBCClientAwait(discovery: ServiceDiscovery, filter: JsonObject, consumerConfiguration: JsonObject): JDBCClient {
    return awaitResult {
      JDBCDataSourceVertxAlias.getJDBCClient(discovery, filter, consumerConfiguration, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.servicediscovery.types.JDBCDataSource.getJDBCClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter, must not be <code>null</code>
   * @param consumerConfiguration the consumer configuration
   * @return [JDBCClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.JDBCDataSource] using Vert.x codegen.
   */
  @Deprecated(message = "Instead use getJDBCClient returning a future that can yield a result ", replaceWith = ReplaceWith("getJDBCClient(discovery, filter, consumerConfiguration).await()"))
  suspend fun getJDBCClientAwait(discovery: ServiceDiscovery, filter: (Record) -> Boolean, consumerConfiguration: JsonObject): JDBCClient {
    return awaitResult {
      JDBCDataSourceVertxAlias.getJDBCClient(discovery, filter, consumerConfiguration, it::handle)
    }
  }

}
