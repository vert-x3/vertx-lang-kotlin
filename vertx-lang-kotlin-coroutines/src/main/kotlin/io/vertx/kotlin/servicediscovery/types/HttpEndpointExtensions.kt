package io.vertx.kotlin.servicediscovery.types

import io.vertx.core.http.HttpClient
import io.vertx.core.json.JsonObject
import io.vertx.ext.web.client.WebClient
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import io.vertx.servicediscovery.types.HttpEndpoint
import java.util.function.Function
import kotlin.Boolean

object HttpEndpointExtensions {
 /**
  *  Convenient method that looks for a HTTP endpoint and provides the configured [HttpClient]. The async result
  *  is marked as failed is there are no matching services, or if the lookup fails.
  * @param discovery     The service discovery instance
  * @param filter        The filter, optional */
 suspend fun getClient(discovery: ServiceDiscovery, filter: JsonObject): HttpClient {
   return awaitResult { HttpEndpoint.getClient(discovery, filter, it) }
 }

 /**
  *  Convenient method that looks for a HTTP endpoint and provides the configured {@linkWebClient}. The async result
  *  is marked as failed is there are no matching services, or if the lookup fails.
  * @param discovery     The service discovery instance
  * @param filter        The filter, optional */
 suspend fun getWebClient(discovery: ServiceDiscovery, filter: JsonObject): WebClient {
   return awaitResult { HttpEndpoint.getWebClient(discovery, filter, it) }
 }

 /**
  *  Convenient method that looks for a HTTP endpoint and provides the configured [HttpClient]. The async result
  *  is marked as failed is there are no matching services, or if the lookup fails. This method accepts a
  *  configuration for the HTTP client
  * @param discovery     The service discovery instance
  * @param filter        The filter, optional
  * @param conf          the configuration of the client */
 suspend fun getClient(
   discovery: ServiceDiscovery,
   filter: JsonObject,
   conf: JsonObject
 ): HttpClient {
   return awaitResult { HttpEndpoint.getClient(discovery, filter, conf, it) }
 }

 /**
  *  Convenient method that looks for a HTTP endpoint and provides the configured [WebClient]. The async result
  *  is marked as failed is there are no matching services, or if the lookup fails. This method accepts a
  *  configuration for the HTTP client
  * @param discovery     The service discovery instance
  * @param filter        The filter, optional
  * @param conf          the configuration of the client */
 suspend fun getWebClient(
   discovery: ServiceDiscovery,
   filter: JsonObject,
   conf: JsonObject
 ): WebClient {
   return awaitResult { HttpEndpoint.getWebClient(discovery, filter, conf, it) }
 }

 /**
  *  Convenient method that looks for a HTTP endpoint and provides the configured [HttpClient]. The async result
  *  is marked as failed is there are no matching services, or if the lookup fails.
  * @param discovery     The service discovery instance
  * @param filter        The filter */
 suspend fun getClient(discovery: ServiceDiscovery, filter: Function<Record, Boolean>): HttpClient {
   return awaitResult { HttpEndpoint.getClient(discovery, filter, it) }
 }

 /**
  *  Convenient method that looks for a HTTP endpoint and provides the configured [WebClient]. The async result
  *  is marked as failed is there are no matching services, or if the lookup fails.
  * @param discovery     The service discovery instance
  * @param filter        The filter */
 suspend fun getWebClient(discovery: ServiceDiscovery, filter: Function<Record, Boolean>): WebClient {
   return awaitResult { HttpEndpoint.getWebClient(discovery, filter, it) }
 }

 /**
  *  Convenient method that looks for a HTTP endpoint and provides the configured [HttpClient]. The async result
  *  is marked as failed is there are no matching services, or if the lookup fails. This method accepts a
  *  configuration for the HTTP client.
  * @param discovery     The service discovery instance
  * @param filter        The filter
  * @param conf          the configuration of the client */
 suspend fun getClient(
   discovery: ServiceDiscovery,
   filter: Function<Record, Boolean>,
   conf: JsonObject
 ): HttpClient {
   return awaitResult { HttpEndpoint.getClient(discovery, filter, conf, it) }
 }

 /**
  *  Convenient method that looks for a HTTP endpoint and provides the configured [WebClient]. The async result
  *  is marked as failed is there are no matching services, or if the lookup fails. This method accepts a
  *  configuration for the HTTP client.
  * @param discovery     The service discovery instance
  * @param filter        The filter
  * @param conf          the configuration of the client */
 suspend fun getWebClient(
   discovery: ServiceDiscovery,
   filter: Function<Record, Boolean>,
   conf: JsonObject
 ): WebClient {
   return awaitResult { HttpEndpoint.getWebClient(discovery, filter, conf, it) }
 }
}
