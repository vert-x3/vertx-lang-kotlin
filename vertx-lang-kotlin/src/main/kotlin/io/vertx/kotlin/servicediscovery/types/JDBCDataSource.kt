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
  suspend fun getJDBCClientAwait(discovery: ServiceDiscovery, filter: (Record) -> Boolean, consumerConfiguration: JsonObject): JDBCClient {
    return awaitResult {
      JDBCDataSourceVertxAlias.getJDBCClient(discovery, filter, consumerConfiguration, it::handle)
    }
  }

}
