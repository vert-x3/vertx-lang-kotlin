package io.vertx.kotlin.servicediscovery.types

import io.vertx.core.json.JsonObject
import io.vertx.ext.jdbc.JDBCClient
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import io.vertx.servicediscovery.types.JDBCDataSource
import java.util.function.Function
import kotlin.Boolean

object JDBCDataSourceExtensions {
 /**
  *  Convenient method that looks for a JDBC datasource source and provides the configured [io.vertx.ext.jdbc.JDBCClient]. The
  *  async result is marked as failed is there are no matching services, or if the lookup fails.
  * @param discovery     The service discovery instance
  * @param filter        The filter, optional */
 suspend fun getJDBCClient(discovery: ServiceDiscovery, filter: JsonObject): JDBCClient {
   return awaitResult { JDBCDataSource.getJDBCClient(discovery, filter, it) }
 }

 /**
  *  Convenient method that looks for a JDBC datasource source and provides the configured [io.vertx.ext.jdbc.JDBCClient]. The
  *  async result is marked as failed is there are no matching services, or if the lookup fails.
  * @param discovery     The service discovery instance
  * @param filter        The filter (must not be `null`) */
 suspend fun getJDBCClient(discovery: ServiceDiscovery, filter: Function<Record, Boolean>): JDBCClient {
   return awaitResult { JDBCDataSource.getJDBCClient(discovery, filter, it) }
 }

 /**
  *  Convenient method that looks for a JDBC datasource source and provides the configured [io.vertx.ext.jdbc.JDBCClient]. The
  *  async result is marked as failed is there are no matching services, or if the lookup fails.
  * @param discovery             The service discovery instance
  * @param filter                The filter, optional
  * @param consumerConfiguration the consumer configuration */
 suspend fun getJDBCClient(
   discovery: ServiceDiscovery,
   filter: JsonObject,
   consumerConfiguration: JsonObject
 ): JDBCClient {
   return awaitResult { JDBCDataSource.getJDBCClient(discovery, filter, consumerConfiguration, it) }
 }

 /**
  *  Convenient method that looks for a JDBC datasource source and provides the configured [io.vertx.ext.jdbc.JDBCClient]. The
  *  async result is marked as failed is there are no matching services, or if the lookup fails.
  * @param discovery             The service discovery instance
  * @param filter                The filter, must not be `null`
  * @param consumerConfiguration the consumer configuration */
 suspend fun getJDBCClient(
   discovery: ServiceDiscovery,
   filter: Function<Record, Boolean>,
   consumerConfiguration: JsonObject
 ): JDBCClient {
   return awaitResult { JDBCDataSource.getJDBCClient(discovery, filter, consumerConfiguration, it) }
 }
}
