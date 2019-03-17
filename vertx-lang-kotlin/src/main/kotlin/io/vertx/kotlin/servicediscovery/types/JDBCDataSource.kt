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
 * Convenient method that looks for a JDBC datasource source and provides the configured [io.vertx.ext.jdbc.JDBCClient]. The
 * async result is marked as failed is there are no matching services, or if the lookup fails.
 *
 * @param discovery The service discovery instance
 * @param filter The filter, optional
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.JDBCDataSource original] using Vert.x codegen.
 */
  suspend fun getJDBCClientAwait(discovery : ServiceDiscovery, filter : JsonObject) : JDBCClient {
    return awaitResult{
      JDBCDataSourceVertxAlias.getJDBCClient(discovery, filter, it)
    }
  }

/**
 * Convenient method that looks for a JDBC datasource source and provides the configured [io.vertx.ext.jdbc.JDBCClient]. The
 * async result is marked as failed is there are no matching services, or if the lookup fails.
 *
 * @param discovery The service discovery instance
 * @param filter The filter (must not be <code>null</code>)
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.JDBCDataSource original] using Vert.x codegen.
 */
  suspend fun getJDBCClientAwait(discovery : ServiceDiscovery, filter : Function<Record,Boolean>) : JDBCClient {
    return awaitResult{
      JDBCDataSourceVertxAlias.getJDBCClient(discovery, filter, it)
    }
  }

/**
 * Convenient method that looks for a JDBC datasource source and provides the configured [io.vertx.ext.jdbc.JDBCClient]. The
 * async result is marked as failed is there are no matching services, or if the lookup fails.
 *
 * @param discovery The service discovery instance
 * @param filter The filter, optional
 * @param consumerConfiguration the consumer configuration
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.JDBCDataSource original] using Vert.x codegen.
 */
  suspend fun getJDBCClientAwait(discovery : ServiceDiscovery, filter : JsonObject, consumerConfiguration : JsonObject) : JDBCClient {
    return awaitResult{
      JDBCDataSourceVertxAlias.getJDBCClient(discovery, filter, consumerConfiguration, it)
    }
  }

/**
 * Convenient method that looks for a JDBC datasource source and provides the configured [io.vertx.ext.jdbc.JDBCClient]. The
 * async result is marked as failed is there are no matching services, or if the lookup fails.
 *
 * @param discovery The service discovery instance
 * @param filter The filter, must not be <code>null</code>
 * @param consumerConfiguration the consumer configuration
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.JDBCDataSource original] using Vert.x codegen.
 */
  suspend fun getJDBCClientAwait(discovery : ServiceDiscovery, filter : Function<Record,Boolean>, consumerConfiguration : JsonObject) : JDBCClient {
    return awaitResult{
      JDBCDataSourceVertxAlias.getJDBCClient(discovery, filter, consumerConfiguration, it)
    }
  }

}
