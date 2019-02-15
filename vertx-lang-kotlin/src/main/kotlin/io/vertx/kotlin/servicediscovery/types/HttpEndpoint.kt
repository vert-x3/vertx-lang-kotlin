package io.vertx.kotlin.servicediscovery.types

import io.vertx.core.http.HttpClient
import io.vertx.core.json.JsonObject
import io.vertx.ext.web.client.WebClient
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import io.vertx.servicediscovery.types.HttpEndpoint as HttpEndpointVertxAlias
import java.util.function.Function

object HttpEndpoint {
  /**
   * Suspending version of method [io.vertx.servicediscovery.types.HttpEndpoint.getClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter, optional
   * @return [HttpClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.HttpEndpoint] using Vert.x codegen.
   */
  suspend fun getClientAwait(discovery: ServiceDiscovery, filter: JsonObject): HttpClient {
    return awaitResult {
      HttpEndpointVertxAlias.getClient(discovery, filter, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.servicediscovery.types.HttpEndpoint.getWebClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter, optional
   * @return [WebClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.HttpEndpoint] using Vert.x codegen.
   */
  suspend fun getWebClientAwait(discovery: ServiceDiscovery, filter: JsonObject): WebClient {
    return awaitResult {
      HttpEndpointVertxAlias.getWebClient(discovery, filter, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.servicediscovery.types.HttpEndpoint.getClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter, optional
   * @param conf the configuration of the client
   * @return [HttpClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.HttpEndpoint] using Vert.x codegen.
   */
  suspend fun getClientAwait(discovery: ServiceDiscovery, filter: JsonObject, conf: JsonObject): HttpClient {
    return awaitResult {
      HttpEndpointVertxAlias.getClient(discovery, filter, conf, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.servicediscovery.types.HttpEndpoint.getWebClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter, optional
   * @param conf the configuration of the client
   * @return [WebClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.HttpEndpoint] using Vert.x codegen.
   */
  suspend fun getWebClientAwait(discovery: ServiceDiscovery, filter: JsonObject, conf: JsonObject): WebClient {
    return awaitResult {
      HttpEndpointVertxAlias.getWebClient(discovery, filter, conf, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.servicediscovery.types.HttpEndpoint.getClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter
   * @return [HttpClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.HttpEndpoint] using Vert.x codegen.
   */
  suspend fun getClientAwait(discovery: ServiceDiscovery, filter: (Record) -> Boolean): HttpClient {
    return awaitResult {
      HttpEndpointVertxAlias.getClient(discovery, filter, it::handle)
    }
  }

  /**
   * Suspending version of method [io.vertx.servicediscovery.types.HttpEndpoint.getWebClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter
   * @return [WebClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.HttpEndpoint] using Vert.x codegen.
   */
  suspend fun getWebClientAwait(discovery: ServiceDiscovery, filter: (Record) -> Boolean): WebClient {
    return awaitResult {
      HttpEndpointVertxAlias.getWebClient(discovery, filter, it::handle)
    }
  }

  /**
   * Suspending version of method [io.vertx.servicediscovery.types.HttpEndpoint.getClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter
   * @param conf the configuration of the client
   * @return [HttpClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.HttpEndpoint] using Vert.x codegen.
   */
  suspend fun getClientAwait(discovery: ServiceDiscovery, filter: (Record) -> Boolean, conf: JsonObject): HttpClient {
    return awaitResult {
      HttpEndpointVertxAlias.getClient(discovery, filter, conf, it::handle)
    }
  }

  /**
   * Suspending version of method [io.vertx.servicediscovery.types.HttpEndpoint.getWebClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter
   * @param conf the configuration of the client
   * @return [WebClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.HttpEndpoint] using Vert.x codegen.
   */
  suspend fun getWebClientAwait(discovery: ServiceDiscovery, filter: (Record) -> Boolean, conf: JsonObject): WebClient {
    return awaitResult {
      HttpEndpointVertxAlias.getWebClient(discovery, filter, conf, it::handle)
    }
  }

}
