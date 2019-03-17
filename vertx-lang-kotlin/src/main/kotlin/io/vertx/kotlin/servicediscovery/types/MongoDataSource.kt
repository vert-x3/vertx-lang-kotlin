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
 * Convenient method that looks for a Mongo datasource source and provides the configured [io.vertx.ext.mongo.MongoClient]. The
 * async result is marked as failed is there are no matching services, or if the lookup fails.
 *
 * @param discovery The service discovery instance
 * @param filter The filter, optional
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.MongoDataSource original] using Vert.x codegen.
 */
  suspend fun getMongoClientAwait(discovery : ServiceDiscovery, filter : JsonObject) : MongoClient {
    return awaitResult{
      MongoDataSourceVertxAlias.getMongoClient(discovery, filter, it)
    }
  }

/**
 * Convenient method that looks for a Mongo datasource source and provides the configured
 * [io.vertx.ext.mongo.MongoClient]. The
 * async result is marked as failed is there are no matching services, or if the lookup fails.
 *
 * @param discovery The service discovery instance
 * @param filter The filter
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.MongoDataSource original] using Vert.x codegen.
 */
  suspend fun getMongoClientAwait(discovery : ServiceDiscovery, filter : Function<Record,Boolean>) : MongoClient {
    return awaitResult{
      MongoDataSourceVertxAlias.getMongoClient(discovery, filter, it)
    }
  }

/**
 * Convenient method that looks for a Mongo datasource source and provides the configured [io.vertx.ext.mongo.MongoClient]. The
 * async result is marked as failed is there are no matching services, or if the lookup fails.
 *
 * @param discovery The service discovery instance
 * @param filter The filter, optional
 * @param consumerConfiguration the consumer configuration
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.MongoDataSource original] using Vert.x codegen.
 */
  suspend fun getMongoClientAwait(discovery : ServiceDiscovery, filter : JsonObject, consumerConfiguration : JsonObject) : MongoClient {
    return awaitResult{
      MongoDataSourceVertxAlias.getMongoClient(discovery, filter, consumerConfiguration, it)
    }
  }

}
