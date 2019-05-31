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
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.redis.RedisClient
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import io.vertx.servicediscovery.types.RedisDataSource as RedisDataSourceVertxAlias
import java.util.function.Function

object RedisDataSource {
  /**
   * Suspending version of method [io.vertx.servicediscovery.types.RedisDataSource.getRedisClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter, optional
   * @return [RedisClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.RedisDataSource] using Vert.x codegen.
   */
  suspend fun getRedisClientAwait(discovery: ServiceDiscovery, filter: JsonObject): RedisClient {
    return awaitResult {
      RedisDataSourceVertxAlias.getRedisClient(discovery, filter, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.servicediscovery.types.RedisDataSource.getRedisClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter, cannot be <code>null</code>
   * @return [RedisClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.RedisDataSource] using Vert.x codegen.
   */
  suspend fun getRedisClientAwait(discovery: ServiceDiscovery, filter: (Record) -> Boolean): RedisClient {
    return awaitResult {
      RedisDataSourceVertxAlias.getRedisClient(discovery, filter, it::handle)
    }
  }

  /**
   * Suspending version of method [io.vertx.servicediscovery.types.RedisDataSource.getRedisClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter, optional
   * @param consumerConfiguration The additional consumer configuration
   * @return [RedisClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.RedisDataSource] using Vert.x codegen.
   */
  suspend fun getRedisClientAwait(discovery: ServiceDiscovery, filter: JsonObject, consumerConfiguration: JsonObject): RedisClient {
    return awaitResult {
      RedisDataSourceVertxAlias.getRedisClient(discovery, filter, consumerConfiguration, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.servicediscovery.types.RedisDataSource.getRedisClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter, cannot be <code>null</code>
   * @param consumerConfiguration The additional consumer configuration
   * @return [RedisClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.RedisDataSource] using Vert.x codegen.
   */
  suspend fun getRedisClientAwait(discovery: ServiceDiscovery, filter: (Record) -> Boolean, consumerConfiguration: JsonObject): RedisClient {
    return awaitResult {
      RedisDataSourceVertxAlias.getRedisClient(discovery, filter, consumerConfiguration, it::handle)
    }
  }

}
