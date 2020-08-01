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
  @Deprecated(message = "Instead use getClient returning a future and chain with await()", replaceWith = ReplaceWith("getClient(discovery, filter).await()"))
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
  @Deprecated(message = "Instead use getWebClient returning a future and chain with await()", replaceWith = ReplaceWith("getWebClient(discovery, filter).await()"))
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
  @Deprecated(message = "Instead use getClient returning a future and chain with await()", replaceWith = ReplaceWith("getClient(discovery, filter, conf).await()"))
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
  @Deprecated(message = "Instead use getWebClient returning a future and chain with await()", replaceWith = ReplaceWith("getWebClient(discovery, filter, conf).await()"))
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
  @Deprecated(message = "Instead use getClient returning a future and chain with await()", replaceWith = ReplaceWith("getClient(discovery, filter).await()"))
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
  @Deprecated(message = "Instead use getWebClient returning a future and chain with await()", replaceWith = ReplaceWith("getWebClient(discovery, filter).await()"))
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
  @Deprecated(message = "Instead use getClient returning a future and chain with await()", replaceWith = ReplaceWith("getClient(discovery, filter, conf).await()"))
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
  @Deprecated(message = "Instead use getWebClient returning a future and chain with await()", replaceWith = ReplaceWith("getWebClient(discovery, filter, conf).await()"))
  suspend fun getWebClientAwait(discovery: ServiceDiscovery, filter: (Record) -> Boolean, conf: JsonObject): WebClient {
    return awaitResult {
      HttpEndpointVertxAlias.getWebClient(discovery, filter, conf, it::handle)
    }
  }

}
