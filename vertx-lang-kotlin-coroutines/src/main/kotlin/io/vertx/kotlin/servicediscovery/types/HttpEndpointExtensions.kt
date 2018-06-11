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
  suspend fun getClient(discovery: ServiceDiscovery, filter: JsonObject): HttpClient = awaitResult { HttpEndpoint.getClient(discovery, filter, it) }

  suspend fun getWebClient(discovery: ServiceDiscovery, filter: JsonObject): WebClient = awaitResult { HttpEndpoint.getWebClient(discovery, filter, it) }

  suspend fun getClient(
      discovery: ServiceDiscovery,
      filter: JsonObject,
      conf: JsonObject
  ): HttpClient = awaitResult { HttpEndpoint.getClient(discovery, filter, conf, it) }

  suspend fun getWebClient(
      discovery: ServiceDiscovery,
      filter: JsonObject,
      conf: JsonObject
  ): WebClient = awaitResult { HttpEndpoint.getWebClient(discovery, filter, conf, it) }

  suspend fun getClient(discovery: ServiceDiscovery, filter: Function<Record, Boolean>): HttpClient = awaitResult { HttpEndpoint.getClient(discovery, filter, it) }

  suspend fun getWebClient(discovery: ServiceDiscovery, filter: Function<Record, Boolean>): WebClient = awaitResult { HttpEndpoint.getWebClient(discovery, filter, it) }

  suspend fun getClient(
      discovery: ServiceDiscovery,
      filter: Function<Record, Boolean>,
      conf: JsonObject
  ): HttpClient = awaitResult { HttpEndpoint.getClient(discovery, filter, conf, it) }

  suspend fun getWebClient(
      discovery: ServiceDiscovery,
      filter: Function<Record, Boolean>,
      conf: JsonObject
  ): WebClient = awaitResult { HttpEndpoint.getWebClient(discovery, filter, conf, it) }
}
