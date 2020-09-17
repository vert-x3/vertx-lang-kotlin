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
import io.vertx.ext.mongo.MongoClient
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import io.vertx.servicediscovery.types.MongoDataSource as MongoDataSourceVertxAlias
import java.util.function.Function

object MongoDataSource {
  /**
   * Suspending version of method [io.vertx.servicediscovery.types.MongoDataSource.getMongoClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter, optional
   * @return [MongoClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.MongoDataSource] using Vert.x codegen.
   */
  @Deprecated(message = "Instead use getMongoClient returning a future and chain with await()", replaceWith = ReplaceWith("getMongoClient(discovery, filter).await()"))
  suspend fun getMongoClientAwait(discovery: ServiceDiscovery, filter: JsonObject): MongoClient {
    return awaitResult {
      MongoDataSourceVertxAlias.getMongoClient(discovery, filter, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.servicediscovery.types.MongoDataSource.getMongoClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter
   * @return [MongoClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.MongoDataSource] using Vert.x codegen.
   */
  @Deprecated(message = "Instead use getMongoClient returning a future and chain with await()", replaceWith = ReplaceWith("getMongoClient(discovery, filter).await()"))
  suspend fun getMongoClientAwait(discovery: ServiceDiscovery, filter: (Record) -> Boolean): MongoClient {
    return awaitResult {
      MongoDataSourceVertxAlias.getMongoClient(discovery, filter, it::handle)
    }
  }

  /**
   * Suspending version of method [io.vertx.servicediscovery.types.MongoDataSource.getMongoClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter, optional
   * @param consumerConfiguration the consumer configuration
   * @return [MongoClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.MongoDataSource] using Vert.x codegen.
   */
  @Deprecated(message = "Instead use getMongoClient returning a future and chain with await()", replaceWith = ReplaceWith("getMongoClient(discovery, filter, consumerConfiguration).await()"))
  suspend fun getMongoClientAwait(discovery: ServiceDiscovery, filter: JsonObject, consumerConfiguration: JsonObject): MongoClient {
    return awaitResult {
      MongoDataSourceVertxAlias.getMongoClient(discovery, filter, consumerConfiguration, it)
    }
  }

}
