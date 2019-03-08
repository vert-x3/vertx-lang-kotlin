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
package io.vertx.kotlin.ext.web.api.contract.openapi3

import io.vertx.core.Vertx
import io.vertx.core.json.JsonObject
import io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory as OpenAPI3RouterFactoryVertxAlias
import io.vertx.kotlin.coroutines.awaitResult

object OpenAPI3RouterFactory {
  /**
   * Suspending version of method [io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory.create]
   *
   * @param vertx 
   * @param url location of your spec. It can be an absolute path, a local path or remote url (with HTTP protocol)
   * @return [OpenAPI3RouterFactoryVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory] using Vert.x codegen.
   */
  suspend fun createAwait(vertx: Vertx, url: String): OpenAPI3RouterFactoryVertxAlias {
    return awaitResult {
      OpenAPI3RouterFactoryVertxAlias.create(vertx, url, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory.create]
   *
   * @param vertx 
   * @param url location of your spec. It can be an absolute path, a local path or remote url (with HTTP protocol)
   * @param auth list of authorization values needed to access the remote url. Each item should be json representation of an 
   * @return [OpenAPI3RouterFactoryVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory] using Vert.x codegen.
   */
  suspend fun createAwait(vertx: Vertx, url: String, auth: List<JsonObject>): OpenAPI3RouterFactoryVertxAlias {
    return awaitResult {
      OpenAPI3RouterFactoryVertxAlias.create(vertx, url, auth, it)
    }
  }

}
