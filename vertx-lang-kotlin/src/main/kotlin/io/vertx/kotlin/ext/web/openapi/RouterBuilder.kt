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
package io.vertx.kotlin.ext.web.openapi

import io.vertx.core.Vertx
import io.vertx.ext.web.openapi.OpenAPILoaderOptions
import io.vertx.ext.web.openapi.RouterBuilder as RouterBuilderVertxAlias
import io.vertx.kotlin.coroutines.awaitResult

object RouterBuilder {
  /**
   * Suspending version of method [io.vertx.ext.web.openapi.RouterBuilder.create]
   *
   * @param vertx 
   * @param url 
   * @return [RouterBuilderVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.ext.web.openapi.RouterBuilder] using Vert.x codegen.
   */
  @Deprecated(message = "Instead use create returning a future and chain with await()", replaceWith = ReplaceWith("create(vertx, url).await()"))
  suspend fun createAwait(vertx: Vertx, url: String): RouterBuilderVertxAlias {
    return awaitResult {
      RouterBuilderVertxAlias.create(vertx, url, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.ext.web.openapi.RouterBuilder.create]
   *
   * @param vertx 
   * @param url 
   * @param options 
   * @return [RouterBuilderVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.ext.web.openapi.RouterBuilder] using Vert.x codegen.
   */
  @Deprecated(message = "Instead use create returning a future and chain with await()", replaceWith = ReplaceWith("create(vertx, url, options).await()"))
  suspend fun createAwait(vertx: Vertx, url: String, options: OpenAPILoaderOptions): RouterBuilderVertxAlias {
    return awaitResult {
      RouterBuilderVertxAlias.create(vertx, url, options, it)
    }
  }

}
