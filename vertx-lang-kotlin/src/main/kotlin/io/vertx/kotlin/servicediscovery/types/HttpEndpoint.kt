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
 * Convenient method that looks for a HTTP endpoint and provides the configured . The async result
 * is marked as failed is there are no matching services, or if the lookup fails.
 *
 * @param discovery The service discovery instance
 * @param filter The filter, optional
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.HttpEndpoint original] using Vert.x codegen.
 */
  suspend fun getClientAwait(discovery : ServiceDiscovery, filter : JsonObject) : HttpClient {
    return awaitResult{
      HttpEndpointVertxAlias.getClient(discovery, filter, it)
    }
  }

/**
 * Convenient method that looks for a HTTP endpoint and provides the configured . The async result
 * is marked as failed is there are no matching services, or if the lookup fails.
 *
 * @param discovery The service discovery instance
 * @param filter The filter, optional
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.HttpEndpoint original] using Vert.x codegen.
 */
  suspend fun getWebClientAwait(discovery : ServiceDiscovery, filter : JsonObject) : WebClient {
    return awaitResult{
      HttpEndpointVertxAlias.getWebClient(discovery, filter, it)
    }
  }

/**
 * Convenient method that looks for a HTTP endpoint and provides the configured . The async result
 * is marked as failed is there are no matching services, or if the lookup fails. This method accepts a
 * configuration for the HTTP client
 *
 * @param discovery The service discovery instance
 * @param filter The filter, optional
 * @param conf the configuration of the client
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.HttpEndpoint original] using Vert.x codegen.
 */
  suspend fun getClientAwait(discovery : ServiceDiscovery, filter : JsonObject, conf : JsonObject) : HttpClient {
    return awaitResult{
      HttpEndpointVertxAlias.getClient(discovery, filter, conf, it)
    }
  }

/**
 * Convenient method that looks for a HTTP endpoint and provides the configured . The async result
 * is marked as failed is there are no matching services, or if the lookup fails. This method accepts a
 * configuration for the HTTP client
 *
 * @param discovery The service discovery instance
 * @param filter The filter, optional
 * @param conf the configuration of the client
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.HttpEndpoint original] using Vert.x codegen.
 */
  suspend fun getWebClientAwait(discovery : ServiceDiscovery, filter : JsonObject, conf : JsonObject) : WebClient {
    return awaitResult{
      HttpEndpointVertxAlias.getWebClient(discovery, filter, conf, it)
    }
  }

/**
 * Convenient method that looks for a HTTP endpoint and provides the configured . The async result
 * is marked as failed is there are no matching services, or if the lookup fails.
 *
 * @param discovery The service discovery instance
 * @param filter The filter
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.HttpEndpoint original] using Vert.x codegen.
 */
  suspend fun getClientAwait(discovery : ServiceDiscovery, filter : Function<Record,Boolean>) : HttpClient {
    return awaitResult{
      HttpEndpointVertxAlias.getClient(discovery, filter, it)
    }
  }

/**
 * Convenient method that looks for a HTTP endpoint and provides the configured . The async result
 * is marked as failed is there are no matching services, or if the lookup fails.
 *
 * @param discovery The service discovery instance
 * @param filter The filter
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.HttpEndpoint original] using Vert.x codegen.
 */
  suspend fun getWebClientAwait(discovery : ServiceDiscovery, filter : Function<Record,Boolean>) : WebClient {
    return awaitResult{
      HttpEndpointVertxAlias.getWebClient(discovery, filter, it)
    }
  }

/**
 * Convenient method that looks for a HTTP endpoint and provides the configured . The async result
 * is marked as failed is there are no matching services, or if the lookup fails. This method accepts a
 * configuration for the HTTP client.
 *
 * @param discovery The service discovery instance
 * @param filter The filter
 * @param conf the configuration of the client
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.HttpEndpoint original] using Vert.x codegen.
 */
  suspend fun getClientAwait(discovery : ServiceDiscovery, filter : Function<Record,Boolean>, conf : JsonObject) : HttpClient {
    return awaitResult{
      HttpEndpointVertxAlias.getClient(discovery, filter, conf, it)
    }
  }

/**
 * Convenient method that looks for a HTTP endpoint and provides the configured . The async result
 * is marked as failed is there are no matching services, or if the lookup fails. This method accepts a
 * configuration for the HTTP client.
 *
 * @param discovery The service discovery instance
 * @param filter The filter
 * @param conf the configuration of the client
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.HttpEndpoint original] using Vert.x codegen.
 */
  suspend fun getWebClientAwait(discovery : ServiceDiscovery, filter : Function<Record,Boolean>, conf : JsonObject) : WebClient {
    return awaitResult{
      HttpEndpointVertxAlias.getWebClient(discovery, filter, conf, it)
    }
  }

}
